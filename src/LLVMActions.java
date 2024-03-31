import generated.EmojiLangBaseListener;
import generated.EmojiLangParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

enum VarType{ INT, REAL, VARIABLE }

class Value{
    public String name;
    public VarType type;
    public Value( String name, VarType type ){
        this.name = name;
        this.type = type;
    }

    public void convertFromVariableType(Map<String, VarType> variables){
        if(variables.get(this.name) == VarType.INT){
            LLVMGenerator.load_i32(this.name);
            this.type = VarType.INT;
        } else if (variables.get(this.name) == VarType.REAL) {
            LLVMGenerator.load_double(this.name);
            this.type = VarType.REAL;
        }
        this.name = "%"+(LLVMGenerator.register-1);
    }
}

public class LLVMActions extends EmojiLangBaseListener {

    Map<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    @Override
    public void exitAssignment(EmojiLangParser.AssignmentContext ctx){
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if(!variables.containsKey(ID)){
            error(ctx.getStart().getLine(), "Trying to assign value to variable which is not declared: " + ID);
        }
        VarType varType = variables.get(ID);
        if(varType != v.type){
            error(ctx.getStart().getLine(), "Trying to assign inappropriate value to variable (inappropriate types): " + ID);
        }
        if( v.type == VarType.INT ){
            LLVMGenerator.assign_i32(ID, v.name);
        }
        if( v.type == VarType.REAL ){
            LLVMGenerator.assign_double(ID, v.name);
        }
    }

    @Override
    public void exitDeclaration(EmojiLangParser.DeclarationContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        variables.put(ID, v.type);
        if( v.type == VarType.INT ){
            LLVMGenerator.declare_i32(ID);
            LLVMGenerator.assign_i32(ID, v.name);
        }
        if( v.type == VarType.REAL ){
            LLVMGenerator.declare_double(ID);
            LLVMGenerator.assign_double(ID, v.name);
        }
    }
    @Override
    public void exitInt(EmojiLangParser.IntContext ctx) {
        stack.push( new Value(ctx.INT().getText(), VarType.INT) );
    }
    @Override
    public void exitReal(EmojiLangParser.RealContext ctx) {
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );
    }
    @Override
    public void exitVar(EmojiLangParser.VarContext ctx) {
        String ID = ctx.ID().getText();
        if(!variables.containsKey(ID)) error(ctx.getStart().getLine(), "Unknown variable "+ID);

        stack.push( new Value(ID, VarType.VARIABLE) );
    }

    @Override
    public void exitProg(EmojiLangParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitPrint(EmojiLangParser.PrintContext ctx) {

        if(ctx.ID() != null ){
            String ID = ctx.ID().getText();
            VarType type = variables.get(ID);
            if( type != null ) {
                if( type == VarType.INT ){
                    LLVMGenerator.printf_i32( ID );
                }
                if( type == VarType.REAL ){
                    LLVMGenerator.printf_double( ID );
                }
            } else {
                error(ctx.getStart().getLine(), "Unknown variable "+ID);
            }
        }else if(ctx.INT() != null){
            String intValue = ctx.INT().getText();
            LLVMGenerator.printf_value_i32(intValue);
        }else if(ctx.REAL() != null){
            String realValue = ctx.REAL().getText();
            LLVMGenerator.printf_value_double(realValue);
        }else{
            error(ctx.getStart().getLine(), "Invalid print statement");
        }
    }

    @Override
    public void exitRead(EmojiLangParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if( ! variables.containsKey(ID) ) {
            error(ctx.getStart().getLine(), "Undeclared variable");
        }
        VarType type = variables.get(ID);
        if( type== VarType.INT){
            LLVMGenerator.scanf(ID);
        }else if (type == VarType.REAL){
            LLVMGenerator.scanf_double(ID);
        }else{
            error(ctx.getStart().getLine(), "Can't read value");
        }
    }

    private void convertIfTypeIsVariable(Value v1, Value v2){
        if(v1.type == VarType.VARIABLE ){
            v1.convertFromVariableType(variables);
        }
        if(v2.type == VarType.VARIABLE ){
            v2.convertFromVariableType(variables);
        }
    }
    @Override
    public void exitAdd(EmojiLangParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        convertIfTypeIsVariable(v1,v2);

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "Add type mismatch");
        }
    }
    @Override
    public void exitSub(EmojiLangParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        convertIfTypeIsVariable(v1,v2);

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.sub_i32(v2.name, v1.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.sub_double(v2.name, v1.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "Sub type mismatch");
        }
    }

    @Override
    public void exitMult(EmojiLangParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        convertIfTypeIsVariable(v1,v2);

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "Mult type mismatch");
        }
    }

    @Override
    public void exitDiv(EmojiLangParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        convertIfTypeIsVariable(v1,v2);

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.div_i32(v2.name, v1.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.div_double(v2.name, v1.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "Div type mismatch");
        }
    }

    @Override
    public void enterBlockif(EmojiLangParser.BlockifContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(EmojiLangParser.BlockifContext ctx) {
        LLVMGenerator.ifend();
    }
    @Override
    public void exitEqualFactor(EmojiLangParser.EqualFactorContext ctx){
        if(ctx.INT()!= null){
            stack.push( new Value(ctx.INT().getText(), VarType.INT) );
        } else if(ctx.REAL()!= null)
        {
            stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );
        } else if (ctx.ID()!= null) {
            stack.push( new Value(ctx.ID().getText(), VarType.VARIABLE) );
        }
    }

    @Override
    public void exitEqual(EmojiLangParser.EqualContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();

        convertIfTypeIsVariable(v1,v2);

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.icmp_i32(v1.name, v2.name);
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.icmp_double(v1.name, v2.name);
            }
        } else {
            error(ctx.getStart().getLine(), "Equal type mismatch");
        }
    }

    @Override
    public void exitRepetitions(EmojiLangParser.RepetitionsContext ctx) {
        if (ctx.ID() != null) {
            Value value = new Value(ctx.ID().getText(), VarType.VARIABLE);
            if (!variables.containsKey(value.name)) {
                error(ctx.getStart().getLine(), "Variable not declared " + value.name);
            }
            value.convertFromVariableType(variables);
            LLVMGenerator.repeatstart(value.name);
        } else if (ctx.INT() != null) {
            Value value = new Value(ctx.INT().getText(), VarType.INT);
            LLVMGenerator.repeatstart(value.name);
        }
    }

        @Override
        public void exitLoopBlock (EmojiLangParser.LoopBlockContext ctx){
            LLVMGenerator.repeatend();
        }

    @Override
    public void exitFunction(EmojiLangParser.FunctionContext ctx) {
        String returnVariable = ctx.ret().ID().getText();
        String returnVariableType = ctx.retType().getText();
        LLVMGenerator.exitFunction(returnVariable, returnVariableType);
    }

    @Override
    public void enterFunction(EmojiLangParser.FunctionContext ctx) {
        String name = ctx.fname().getText();
        String[] argsNames = ctx.fargs().ID().stream().map(ParseTree::getText).toArray(String[]::new);
        String[] argsTypes = ctx.fargs().fargsType().stream().map(ParseTree::getText).toArray(String[]::new);
        for(int i = 0; i < argsNames.length; i++){
            if(argsTypes[i].equals("real")){
                variables.put(argsNames[i], VarType.REAL);
            } else if (argsTypes[i].equals("int")) {
                variables.put(argsNames[i], VarType.INT);
            }
        }
        String retType = ctx.retType().getText();
        LLVMGenerator.enterFunction(name, retType, argsNames, argsTypes);
    }


    @Override
    public void exitFunBlock(EmojiLangParser.FunBlockContext ctx) {

    }
    @Override
    public void exitFname(EmojiLangParser.FnameContext ctx) {

    }

    @Override
    public void exitFargs(EmojiLangParser.FargsContext ctx) {

    }

    @Override
    public void exitRet(EmojiLangParser.RetContext ctx) {

    }


        void error ( int line, String msg){
            System.err.println("Error, line " + line + ", " + msg);
            System.exit(1);
        }
}
