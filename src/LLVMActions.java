import generated.EmojiLangBaseListener;
import generated.EmojiLangParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.Collectors;

enum VarType{ INT, REAL, VARIABLE}

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

class Structure {
    String name;
    List<String> types;
    List<String> propNames;
    public Structure(String name, List<String> types, List<String> propNames){
        this.name = name;
        this.types = types;
        this.propNames = propNames;
    }
}

class ArrayType {
    VarType type;
    String name;
    int numberOfElems;
    int mappedRegisterName;
    public ArrayType(String name, VarType type, int mappedRegisterName, int numberOfElems){
        this.type = type;
        this.name = name;
        this.mappedRegisterName = mappedRegisterName;
        this.numberOfElems = numberOfElems;
    }
}

class StringType{
    int length;
    String registerName;

    public StringType(int length, String registerName){
        this.length = length;
        this.registerName = registerName;
    }
}

public class LLVMActions extends EmojiLangBaseListener {

    Map<String, VarType> globalVariables = new HashMap<String, VarType>();
    Map<String, VarType> localVariables = new HashMap<String, VarType>();
    Map<String, String> localVariablesMapped = new HashMap<String, String>();

    Map<String, String> functionsWithRetType = new HashMap<>();
    Map<String, Structure> nameToStructure = new HashMap<>();
    Map<String, String> structuresVariablesMappedNames = new HashMap<>();

    Map<String, Structure> structuresVariablesToStructure = new HashMap<>();

    Map<String, ArrayType> arrayNamesMapped = new HashMap<>();

    Map<String, StringType> stringMapped = new HashMap<>();


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
    public void exitValueFromStructProperty(EmojiLangParser.ValueFromStructPropertyContext ctx) {
        String structVariableName = ctx.valueFromStructProp().ID().getText();
        if (!structuresVariablesMappedNames.containsKey(structVariableName)) {
            error(ctx.getStart().getLine(), "Unknown variable " + structVariableName);
        }
        String mappedVariableName = structuresVariablesMappedNames.get(structVariableName);
        Structure structure = structuresVariablesToStructure.get(structVariableName);

        String propName = ctx.valueFromStructProp().structProperty().getText();
        if (!structure.propNames.contains(propName)) {
            error(ctx.getStart().getLine(), "Unknown struct property " + propName);
        }
        String type = structure.types.get(structure.propNames.indexOf(propName));

        LLVMGenerator.getPtrToStructProp(structure.name, mappedVariableName, structure.propNames.indexOf(propName));

        if (type.equals("i32")) {
            LLVMGenerator.load_i32(String.valueOf(LLVMGenerator.register - 1));
            stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT));
        }
        if (type.equals("double")) {
            LLVMGenerator.load_i32(String.valueOf(LLVMGenerator.register - 1));
            stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL));
        }
    }

    @Override
    public void exitValueFromArray(EmojiLangParser.ValueFromArrayContext ctx) {
        String arrName = ctx.arrValue().ID().getText();
        if(!arrayNamesMapped.containsKey(arrName)){
            error(ctx.getStart().getLine(), "Array "+(arrName)+" not declared");
        }
        ArrayType array = arrayNamesMapped.get(arrName);
        String idx = ctx.arrValue().INT().getText();
        if(array.type == VarType.INT){
            LLVMGenerator.getArrayPtrInt(array.mappedRegisterName, array.numberOfElems, idx);
            LLVMGenerator.load_i32(String.valueOf(LLVMGenerator.register -1));
            stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT));
        }
        if(array.type == VarType.REAL){
            LLVMGenerator.getArrayPtrReal(array.mappedRegisterName, array.numberOfElems, idx);
            LLVMGenerator.load_double(String.valueOf(LLVMGenerator.register -1));
            stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL));
        }
    }


    @Override
    public void exitPrint(EmojiLangParser.PrintContext ctx) {

        if(ctx.ID() != null ){
            String ID = ctx.ID().getText();
            // TODO: check if variable is in string map
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
                if(localVariablesMapped.containsKey(ID)) ID = localVariablesMapped.get(ID);
                if(type == VarType.INT){
                    LLVMGenerator.load_i32(ID);
                    LLVMGenerator.printf_i32(String.valueOf(LLVMGenerator.register - 1));
                } else if (type == VarType.REAL) {
                    LLVMGenerator.load_double(ID);
                    LLVMGenerator.printf_double(String.valueOf(LLVMGenerator.register - 1));
                }
                return;
            }
            if(stringMapped.containsKey(ID)){
                StringType stringObj = stringMapped.get(ID);

                LLVMGenerator.getStringPtr(stringObj.length, stringObj.registerName);
                LLVMGenerator.printf_string();
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

    @Override
    public void exitStructDef(EmojiLangParser.StructDefContext ctx) {
        String structName = ctx.ID().getText();
        if(nameToStructure.containsKey(structName)) error(ctx.getStart().getLine(), "Struct with given name already exists " + structName);
        List<String> types = ctx.structBlock().structValueTypes().stream().map(x->{
            if(Objects.equals(x.getText(), "real")) return "double";
            if(Objects.equals(x.getText(), "int")) return "i32";
            return null;
        }).collect(Collectors.toList());

        List<String> propNames = ctx.structBlock().ID().stream().map(ParseTree::getText).collect(Collectors.toList());
        LLVMGenerator.global = true;
        LLVMGenerator.createStructure(structName, types.toArray(String[]::new));
        LLVMGenerator.global = false;
        Structure structure = new Structure(structName, types, propNames);
        nameToStructure.put(structName, structure);
    }

    @Override
    public void exitStructDeclaration(EmojiLangParser.StructDeclarationContext ctx) {
        String structVariableName = ctx.ID().getText();
        String structTypeName = ctx.structName().getText();
        LLVMGenerator.declareStructure(structTypeName);
        structuresVariablesToStructure.put(structVariableName, nameToStructure.get(structTypeName));
        structuresVariablesMappedNames.put(structVariableName, String.valueOf(LLVMGenerator.register-1));
    }

    @Override
    public void exitAssignValueToStructure(EmojiLangParser.AssignValueToStructureContext ctx) {
        String structVariableName = ctx.ID().getText();
        if(!structuresVariablesMappedNames.containsKey(structVariableName)) error(ctx.getStart().getLine(), "Struct not initialized " + structVariableName);
        String propName = ctx.structProp().getText();
        Structure s = structuresVariablesToStructure.get(structVariableName);
        if(!s.propNames.contains(propName)) error(ctx.getStart().getLine(), "Struct does not have this prop name " + propName);
        String propType = s.types.get(s.propNames.indexOf(propName));
        if(propType.equals("i32") && ctx.structPropValue().INT() == null || propType.equals("double") && ctx.structPropValue().REAL() == null ){
            error(ctx.getStart().getLine(), "Trying to assign inappropriate value " + propName);
        }
        String mappedVariable = structuresVariablesMappedNames.get(structVariableName);
        if(ctx.structPropValue().INT()!=null){
            String value = ctx.structPropValue().INT().getText();
            LLVMGenerator.getPtrToStructProp(s.name, mappedVariable, s.propNames.indexOf(propName));
            LLVMGenerator.assign_i32(String.valueOf(LLVMGenerator.register-1),value);
        }

        if(ctx.structPropValue().REAL()!=null){
            String value = ctx.structPropValue().REAL().getText();
            LLVMGenerator.getPtrToStructProp(s.name, mappedVariable, s.propNames.indexOf(propName));
            LLVMGenerator.assign_double(String.valueOf(LLVMGenerator.register-1),value);
        }

    }

    @Override public void exitArrayDeclaration(EmojiLangParser.ArrayDeclarationContext ctx) {
        String arrayName = ctx.ID().getText();
        List<String> intValues = ctx.arrayValues().INT().stream().map(ParseTree::getText).collect(Collectors.toList());
        List<String> realValues = ctx.arrayValues().REAL().stream().map(ParseTree::getText).collect(Collectors.toList());
        if(!intValues.isEmpty() && !realValues.isEmpty()) error(ctx.getStart().getLine(), "Trying to assign mixed value types to array " + arrayName);

        if(!realValues.isEmpty()){
            int registerAllocatedArray = LLVMGenerator.allocateDoubleArrayAndStoreValues(realValues.size(), realValues.toArray(String[]::new));
            arrayNamesMapped.put(arrayName, new ArrayType(arrayName, VarType.REAL, registerAllocatedArray, realValues.size()));
        }

        if(!intValues.isEmpty()){
            int registerAllocatedArray = LLVMGenerator.allocateIntArrayAndStoreValues(arrayName ,intValues.size(), intValues.toArray(String[]::new));
            arrayNamesMapped.put(arrayName, new ArrayType(arrayName, VarType.INT, registerAllocatedArray, intValues.size()));
        }
    }

    @Override
    public void exitStringDeclaration(EmojiLangParser.StringDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String value = ctx.STRING().getText();
        String valueWithoutQuote = value.substring(1, value.length() -1);

        int stringRegisterPointer = LLVMGenerator.declare_string(valueWithoutQuote.length(), varName, valueWithoutQuote);
        stringMapped.put(varName, new StringType(valueWithoutQuote.length(), Integer.toString(stringRegisterPointer)));
        //TODO: add variable to string map
    }


    void error ( int line, String msg){
            System.err.println("Error, line " + line + ", " + msg);
            System.exit(1);
    }
}

/*
TODO: Assign return value from function
 */