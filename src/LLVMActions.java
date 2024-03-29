import generated.EmojiLangBaseListener;
import generated.EmojiLangParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

enum VarType{ INT, REAL }

class Value{
    public String name;
    public VarType type;
    public Value( String name, VarType type ){
        this.name = name;
        this.type = type;
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

    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }

}
