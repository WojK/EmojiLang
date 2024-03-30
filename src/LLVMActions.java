import generated.EmojiLangBaseListener;
import generated.EmojiLangParser;

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

    public Value convertFromVariableType(Value value, Map<String, VarType> variables){
        Value convertedValue = new Value(value.name, value.type);
        if(variables.get(convertedValue.name) == VarType.INT){
            LLVMGenerator.load_i32(value.name);
            value.type = VarType.INT;
        } else if (variables.get(convertedValue.name) == VarType.REAL) {
            LLVMGenerator.load_double(value.name);
            value.type = VarType.REAL;
        }
        value.name = "%"+(LLVMGenerator.register-1);
        return convertedValue;
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

    @Override
    public void exitAdd(EmojiLangParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if(v1.type == VarType.VARIABLE ){
            if(variables.get(v1.name) == VarType.INT){
                LLVMGenerator.load_i32(v1.name);
                v1.type = VarType.INT;
            } else if (variables.get(v1.name) == VarType.REAL) {
                LLVMGenerator.load_double(v1.name);
                v1.type = VarType.REAL;
            }
            v1.name = "%"+(LLVMGenerator.register-1);
        }

        if(v2.type == VarType.VARIABLE ){
            if(variables.get(v2.name) == VarType.INT){
                LLVMGenerator.load_i32(v2.name);
                v2.type = VarType.INT;
            } else if (variables.get(v2.name) == VarType.REAL) {
                LLVMGenerator.load_double(v2.name);
                v2.type = VarType.REAL;
            }
            v2.name = "%"+(LLVMGenerator.register-1);
        }

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
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.sub_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.sub_double(v1.name, v2.name);
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
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.div_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "Div type mismatch");
        }
    }

    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }

}
