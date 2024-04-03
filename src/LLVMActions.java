import generated.EmojiLangBaseListener;
import generated.EmojiLangParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
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

    public void convertFromVariableType(Map<String, VarType> variables, Map<String, VarType> localVariables,
                                        Map<String, String> mappedLocalNames){

        if(variables.containsKey(this.name)){
            this.type = variables.get(this.name);
            if(this.type == VarType.INT){
                LLVMGenerator.load_i32_global(this.name);
                this.name = "%"+(LLVMGenerator.register-1);
            }else if(this.type == VarType.REAL){
                LLVMGenerator.load_double_global(this.name);
                this.name = "%"+(LLVMGenerator.register-1);
            }
        }

        if(localVariables.containsKey(this.name)){
            this.type = localVariables.get(this.name);
            if(mappedLocalNames.containsKey(this.name)){
                this.name = mappedLocalNames.get(this.name);
            }
            if(this.type == VarType.INT){
                LLVMGenerator.load_i32(this.name);
                this.name = "%"+(LLVMGenerator.register-1);
            }else if(this.type == VarType.REAL){
                LLVMGenerator.load_double(this.name);
                this.name = "%"+(LLVMGenerator.register-1);
            }
        }
    }
}

public class LLVMActions extends EmojiLangBaseListener {

    Map<String, VarType> globalVariables = new HashMap<String, VarType>();
    Map<String, VarType> localVariables = new HashMap<String, VarType>();
    Map<String, String> localVariablesMapped = new HashMap<String, String>();

    Map<String, String> functionsWithRetType = new HashMap<>();

    Stack<Value> stack = new Stack<Value>();

    private void convertIfTypeIsVariable(Value v1, Value v2){

        if(v1.type == VarType.VARIABLE){
            v1.convertFromVariableType(globalVariables, localVariables, localVariablesMapped);
        }
        if(v2.type == VarType.VARIABLE ){
            v2.convertFromVariableType(globalVariables, localVariables, localVariablesMapped);
        }
    }

    @Override
    public void enterProg(EmojiLangParser.ProgContext ctx) {
        LLVMGenerator.global = true;
    }

    @Override
    public void exitProg(EmojiLangParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitAssignment(EmojiLangParser.AssignmentContext ctx){
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if(!localVariables.containsKey(ID)){
            error(ctx.getStart().getLine(), "Trying to assign value to variable which is not declared: " + ID);
        }
        VarType varType = localVariables.get(ID);
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
        localVariables.put(ID, v.type);

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
    public void enterGlobalDeclatarion(EmojiLangParser.GlobalDeclatarionContext ctx) {
        LLVMGenerator.global = true;
    }

    @Override
    public void exitGlobalDeclatarion(EmojiLangParser.GlobalDeclatarionContext ctx) {
        String ID = ctx.ID().getText();
        String value = ctx.globalValue().getText();
        VarType type;
        if(ctx.globalValue().INT() != null) {
            type = VarType.INT;
        } else{
            type = VarType.REAL;
        }
        globalVariables.put(ID, type);

        if( type == VarType.INT ){
            LLVMGenerator.declare_global_i32(ID, value);
        }
        if(type == VarType.REAL ){
            LLVMGenerator.declare_global_double(ID, value);
        }
        LLVMGenerator.global = false;
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
        if(!globalVariables.containsKey(ID) && !localVariables.containsKey(ID)) error(ctx.getStart().getLine(), "Unknown variable "+ID);

        stack.push( new Value(ID, VarType.VARIABLE) );
    }

    @Override
    public void exitPrint(EmojiLangParser.PrintContext ctx) {

        if(ctx.ID() != null ){
            String ID = ctx.ID().getText();

            if(globalVariables.containsKey(ID)){
                VarType type = globalVariables.get(ID);
                if(type == VarType.INT){
                    LLVMGenerator.load_i32_global(ID);
                    LLVMGenerator.printf_i32(String.valueOf(LLVMGenerator.register - 1));
                } else if (type == VarType.REAL) {
                    LLVMGenerator.load_double_global(ID);
                    LLVMGenerator.printf_double(String.valueOf(LLVMGenerator.register - 1));
                }
                return;
            }
            if(localVariables.containsKey(ID)){
                VarType type = localVariables.get(ID);
                if(localVariablesMapped.containsValue(ID)) ID = localVariablesMapped.get(ID);
                if(type == VarType.INT){
                    LLVMGenerator.load_i32(ID);
                    LLVMGenerator.printf_i32(String.valueOf(LLVMGenerator.register - 1));
                } else if (type == VarType.REAL) {
                    LLVMGenerator.load_double(ID);
                    LLVMGenerator.printf_double(String.valueOf(LLVMGenerator.register - 1));
                }
                return;
            }
            error(ctx.getStart().getLine(), "Unknown variable "+ID);
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
        if( !localVariables.containsKey(ID) ) {
            error(ctx.getStart().getLine(), "Undeclared variable");
        }
        VarType type = localVariables.get(ID);
        if( type == VarType.INT){
            LLVMGenerator.scanf(ID);
        }else if (type == VarType.REAL){
            LLVMGenerator.scanf_double(ID);
        }else{
            error(ctx.getStart().getLine(), "Can't read value");
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
            if (!globalVariables.containsKey(value.name) && !localVariables.containsKey(value.name)) {
                error(ctx.getStart().getLine(), "Variable not declared " + value.name);
            }
            value.convertFromVariableType(globalVariables, localVariables, localVariablesMapped);
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
        String mappedReturnVariable = localVariablesMapped.containsKey(returnVariable) ?
               "%"+localVariablesMapped.get(returnVariable) : "%"+returnVariable;
        String returnVariableType = ctx.retType().getText();
        LLVMGenerator.exitFunction(mappedReturnVariable, returnVariableType);
        LLVMGenerator.global = false;
    }

    @Override
    public void enterFunction(EmojiLangParser.FunctionContext ctx) {
        if(functionsWithRetType.containsValue(ctx.fname().getText())){
            error(ctx.getStart().getLine(), "Function with given name already exists");
        }
        LLVMGenerator.global = true;
        localVariables.clear();
        localVariablesMapped.clear();
        String name = ctx.fname().getText();
        String[] argsNames = ctx.fargs().ID().stream().map(ParseTree::getText).toArray(String[]::new);
        String[] argsTypes = ctx.fargs().fargsType().stream().map(ParseTree::getText).toArray(String[]::new);

        String retType = ctx.retType().getText();
        String mappedRetType = "";
        if(retType.equals("real")){
            mappedRetType = "double";
        }else if(retType.equals("int")){
            mappedRetType = "i32";
        }
        functionsWithRetType.put(name, mappedRetType);

        int[] mappedArgsNames = LLVMGenerator.enterFunction(name, mappedRetType, argsNames, argsTypes);

        for(int i = 0; i < mappedArgsNames.length; i++){
            if(argsTypes[i].equals("real")){
                localVariables.put(argsNames[i], VarType.REAL);
                localVariablesMapped.put(argsNames[i],String.valueOf(mappedArgsNames[i]));
            } else if (argsTypes[i].equals("int")) {
                localVariables.put(argsNames[i], VarType.INT);
                localVariablesMapped.put(argsNames[i],String.valueOf(mappedArgsNames[i]));
            }
        }
    }

    @Override
    public void exitFunctionExec(EmojiLangParser.FunctionExecContext ctx) {
        String ID = ctx.fname().getText();
        String[] argsNames = ctx.fargsExec().ID().stream().map(ParseTree::getText).toArray(String[]::new);
        String[] argsTypes = new String[argsNames.length];
        for(int i = 0; i < argsNames.length; i++){
            String type;
            if(globalVariables.containsKey(argsNames[i])) {
                type = globalVariables.get(argsNames[i]).name();
                argsTypes[i] = type;
            } else if (localVariables.containsKey(argsNames[i])) {
                type = localVariables.get(argsNames[i]).name();
                argsTypes[i] = type;
            }else{
                error(ctx.getStart().getLine(), "Not found given variable " + argsNames[i]);
            }
        }
        LLVMGenerator.execFunc(ID, functionsWithRetType.get(ID), argsTypes, argsNames);
    }

    void error ( int line, String msg){
            System.err.println("Error, line " + line + ", " + msg);
            System.exit(1);
    }
}

/*
TODO: Assign return value from function
 */