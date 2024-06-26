import java.util.Arrays;
import java.util.Stack;

public class LLVMGenerator {
    static String header_text = "";
    static String header_top = "";
    static String main_text = "";

    static String buffer = "";

    static int register = 1;
    static int br = 0;
    static int anonymousString = 0;

    static boolean global;

    static Stack<Integer> brstack = new Stack<Integer>();

    static void addTextDependOnScope(){
        if(global){
            header_text += buffer;
        }else{
            main_text += buffer;
        }
        buffer = "";
    }

    static String generate(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "declare void @llvm.memset.p0i8.i64(i8* nocapture writeonly, i8, i64, i1 immarg)\n";
        text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strd = constant [4 x i8] c\"%lf\\00\"\n";
        text += header_top;
        text += "@.str = private unnamed_addr constant [3 x i8] c\"%s\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }
    static void printf_i32(String name){
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+name+")\n";
        register++;
        addTextDependOnScope();
    }

    static void printf_double(String name){
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+name+")\n";
        register++;
        addTextDependOnScope();
    }

    static void printf_value_i32(String value) {
        buffer += "%"+ register +" = alloca i32\n";
        register++;
        buffer += "store i32 "+ value +", i32* %"+ (register - 1) +"\n";
        buffer += "%"+ register +" = load i32, i32* %"+ (register - 1) +"\n";
        register++;
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+ (register - 1) +")\n";
        register++;
        addTextDependOnScope();
    }


    static void printf_value_double(String value) {
        buffer += "%"+ register +" = alloca double\n";
        register++;
        buffer += "store double "+ value +", double* %"+ (register - 1) +"\n";
        buffer += "%"+ register +" = load double, double* %"+ (register - 1) +"\n";
        register++;
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+ (register - 1) +")\n";
        register++;
        addTextDependOnScope();
    }

    static void load_i32(String id){
        buffer += "%"+register+" = load i32, i32* %"+id +"\n"; register++;
        addTextDependOnScope();
    }
    static void load_double(String id){
        buffer += "%"+register+" = load double, double* %"+id+"\n"; register++;
        addTextDependOnScope();
    }

    static void load_i32_global(String id){
        buffer += "%"+register+" = load i32, i32* @"+id +"\n"; register++;
        addTextDependOnScope();
    }
    static void load_double_global(String id){
        buffer += "%"+register+" = load double, double* @"+id+"\n"; register++;
        addTextDependOnScope();
    }

    static void declare_i32(String id){
        buffer += "%"+id+" = alloca i32\n";
        addTextDependOnScope();
    }

    static void declare_double(String id){
        buffer += "%"+id+" = alloca double\n";
        addTextDependOnScope();
    }

    static void declare_global_i32(String id, String value){
        buffer += "@"+id+" = global i32 "+value+"\n";
        addTextDependOnScope();
    }

    static void declare_global_double(String id, String value){
        buffer += "@"+id+" = global double "+value+"\n";
        addTextDependOnScope();
    }

    static void assign_i32(String id, String value){
        buffer += "store i32 "+value+", i32* %"+id+"\n";
        addTextDependOnScope();
    }

    static void assign_double(String id, String value){
        buffer += "store double "+value+", double* %"+id+"\n";
        addTextDependOnScope();
    }

    static void scanf(String id){
        buffer += "%"+register+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %"+id+")\n";
        register++;
        addTextDependOnScope();
    }
    static void scanf_double(String id){
        buffer += "%"+register+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strd, i32 0, i32 0), double* %"+id+")\n";
        register++;
        addTextDependOnScope();
    }

    static void add_i32(String val1, String val2){
        buffer += "%"+register+" = add i32 "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void add_double(String val1, String val2){
        buffer += "%"+register+" = fadd double "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void sub_i32(String val1, String val2){
        buffer += "%"+register+" = sub i32 "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void sub_double(String val1, String val2){
        buffer += "%"+register+" = fsub double "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void mult_i32(String val1, String val2){
        buffer += "%"+register+" = mul i32 "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void mult_double(String val1, String val2){
        buffer += "%"+register+" = fmul double "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void div_i32(String val1, String val2){
        buffer += "%"+register+" = sdiv i32 "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void div_double(String val1, String val2){
        buffer += "%"+register+" = fdiv double "+val1+", "+val2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void ifstart(){
        br++;
        buffer += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        buffer += "true"+br+":\n";
        brstack.push(br);
        addTextDependOnScope();
    }

    static void ifend(){
        int b = brstack.pop();
        buffer += "br label %false"+b+"\n";
        buffer += "false"+b+":\n";
        addTextDependOnScope();
    }

    static void icmp_i32(String v1, String v2){
        buffer += "%"+register+" = icmp eq i32 "+v1+", "+v2+"\n";
        register++;
        addTextDependOnScope();
    }
    static void icmp_double(String v1, String v2){
        buffer += "%"+register+" = fcmp oeq double "+v1+", "+v2+"\n";
        register++;
        addTextDependOnScope();
    }

    static void repeatstart(String repetitions){
        declare_i32(Integer.toString(register));
        int counter = register;
        register++;
        assign_i32(Integer.toString(counter), "0");
        br++;
        buffer += "br label %cond"+br+"\n";
        buffer += "cond"+br+":\n";

        load_i32(Integer.toString(counter));
        add_i32("%"+(register-1), "1");
        assign_i32(Integer.toString(counter), "%"+(register-1));

        buffer += "%"+register+" = icmp slt i32 %"+(register-2)+", "+repetitions+"\n";
        register++;

        buffer += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        buffer += "true"+br+":\n";
        brstack.push(br);
        addTextDependOnScope();
    }

    static void repeatend(){
        int b = brstack.pop();
        buffer += "br label %cond"+b+"\n";
        buffer += "false"+b+":\n";
        addTextDependOnScope();
    }

    static int[] enterFunction(String name, String retType, String[] args, String[] argsTypes ){
        int[] argsNamesInitialMapped = new int[args.length];
        int[] argsNamesMapped = new int[args.length];
        register = 0;
        buffer += "define "+retType+" @"+name+"(";
        for(int i = 0; i < args.length; i++){
            if(argsTypes[i].equals("int")){
                buffer += "i32 %"+register;
            }else if(argsTypes[i].equals("real")){
                buffer += "double %"+register;
            }
            argsNamesInitialMapped[i] = register;
            register++;
            if(i != args.length-1){
                buffer += ", ";
            }
        }
        register++;
        buffer += ") {\n";
        for(int i = 0; i < argsNamesInitialMapped.length; i++){
            if(argsTypes[i].equals("int")){
                buffer += "%"+register+" = alloca i32\n";
                buffer += "store i32 %"+argsNamesInitialMapped[i]+", i32* %" + register+"\n";
                argsNamesMapped[i] = register;
                register++;
            }else if(argsTypes[i].equals("real")){
                buffer += "%"+register+" = alloca double\n";
                buffer += "store double %"+argsNamesInitialMapped[i]+", double* %" +register+"\n";
                argsNamesMapped[i] = register;
                register++;
            }
        }
        addTextDependOnScope();
        return argsNamesMapped;
    }

    static void exitFunction(String returnVariable, String returnVariableType){
        String mappedRetType = "";
        if(returnVariableType.equals("real")){
            mappedRetType = "double";
        }else if(returnVariableType.equals("int")){
            mappedRetType = "i32";
        }
        buffer += "%"+register + " = load " + mappedRetType + ", "+mappedRetType+"* "+returnVariable+"\n";
        buffer += "ret " + mappedRetType + " %" +register+"\n}\n";
        register = 1;
        addTextDependOnScope();
    }

    static void execFunc(String id, String returnType ,String[] argsTypes, String[] argsNames){
        String[] argsTypesMapped = Arrays.stream(argsTypes).map(x -> {
            if(x.equals("REAL")){
                return "double";
            }else{
                return "i32";
            }
        }).toArray(String[]::new);

        String argsMapped = "";
        for(int i = 0; i < argsNames.length; i++){
            argsMapped += argsTypesMapped[i] +" %"+register;
            if(i != argsNames.length - 1){
                argsMapped += ", ";
            }
            buffer += "%"+register+" = load "+argsTypesMapped[i]+", "+argsTypesMapped[i]+"* %"+argsNames[i]+"\n";
            register++;
        }

        buffer += "%"+register+" = call "+returnType+ " @"+id+"("+argsMapped+")\n";
        register++;
        addTextDependOnScope();
    }

    public static void createStructure(String structName, String[] types) {
        buffer += "%struct." + structName + " = type { ";
        for(int i = 0; i < types.length; i++) {
            buffer += types[i];
            if(i != types.length - 1) buffer += ", ";
        }
        buffer += " }\n";
        addTextDependOnScope();
    }

    public static void declareStructure(String structTypeName) {
        buffer += "%"+register+" = alloca %struct." + structTypeName+"\n";
        register++;
        addTextDependOnScope();
    }

    public static void getPtrToStructProp(String structName, String structVariableName, int indexInStruct) {
        buffer += "%"+register+" = getelementptr inbounds %struct."+structName
                +", %struct." +structName+"* %"+structVariableName+", i32 0, i32 "+indexInStruct+"\n";
        register++;
        addTextDependOnScope();
    }

    public static int allocateDoubleArrayAndStoreValues(int size, String[] values) {
        buffer += "%"+register+" = alloca ["+size+" x double]\n";
        register++;
        int registerAllocatedArray = register - 1;
        buffer += "%"+register+" = bitcast ["+size+" x double]* %"+(register-1)+" to i8*\n";
        register++;
        buffer += "call void @llvm.memset.p0i8.i64(i8* %"+(register-1)+", i8 0, i64 "+(size*8)+", i1 false)\n";
        buffer += "%"+register+" = bitcast i8* %"+(register-1)+" to ["+size+" x double]*\n";
        register++;
        int registerArrayPtr = register - 1;

        for(int i = 0; i < values.length; i++){
            getPtrArrayAndStoreValue(values.length, values[i],registerArrayPtr ,i);
        }
        addTextDependOnScope();
        return registerAllocatedArray;
    }

    public static void getPtrArrayAndStoreValue(int size, String value, int arrayRegisterPtr, int arrayIdx){
        buffer += "%"+register+" = getelementptr inbounds ["+size+" x double], ["+size+" x double]* %"+arrayRegisterPtr+", i32 0, i32 "+ arrayIdx+"\n";
        register++;
        buffer += "store double "+(value)+", double* %"+(register-1)+"\n";
    }

    public static int allocateIntArrayAndStoreValues(String arrayName, int size, String[] array) {
        String globalArrayName = "@__const.main."+arrayName;

        header_top += globalArrayName+" = unnamed_addr constant ["+size+ "x i32] [";
        for(int i = 0; i < array.length; i++){
            header_top+= "i32 "+ array[i];
            if(i != array.length-1){
                header_top += ", ";
            }
        }
        header_top += "]\n";
        buffer += "%"+(register)+" = alloca ["+(size)+" x i32]\n";
        register++;
        int registerAllocatedArray = register - 1;
        buffer += "%"+(register)+" = bitcast ["+(size)+" x i32]* %"+(register-1)+" to i8*\n";
        register++;
        buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* %"+(register-1)+", i8* bitcast (["+(size)+" x i32]* "+(globalArrayName)+" to i8*), i64 "+(size*4)+" , i1 false)\n";
        addTextDependOnScope();
        return registerAllocatedArray;
    }

    public static void getArrayPtrInt(int mappedRegisterName, int numberOfElems, String idx) {
        buffer += "%"+register+" = getelementptr inbounds [" + numberOfElems+" x i32], " +
                "["+numberOfElems+" x i32]* %"+mappedRegisterName+", i64 0, i64 "+idx+"\n";
        register++;
        addTextDependOnScope();
    }

    public static void getArrayPtrReal(int mappedRegisterName, int numberOfElems, String idx) {
        buffer += "%"+register+" = getelementptr inbounds [" + numberOfElems+" x double]," +
                " ["+numberOfElems+" x double]* %"+mappedRegisterName+", i64 0, i64 "+idx+"\n";
        register++;
        addTextDependOnScope();
    }

    public static int declare_string(int size, String id, String value){
        header_top += "@__const.main."+(id)+" = private unnamed_addr constant ["+(size+1)+" x i8] c\""+(value)+"\\00\"\n";

        buffer += "%"+register+" = alloca ["+(size+1)+" x i8]\n";
        register++;
        int arrayRegister = register - 1;
        buffer += "%"+register+" = bitcast ["+(size+1)+" x i8]* %"+arrayRegister+" to i8*\n";
        register++;
        buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* %"+(register-1)+", i8* align 1 getelementptr inbounds " +
                "(["+(size+1)+" x i8], ["+(size+1)+" x i8]* @__const.main."+id+", i32 0, i32 0), i64 "+(size+1)+", i1 false)\n";
        addTextDependOnScope();

        return arrayRegister;
    }

    public static void getStringPtr(int size, String mappedRegisterName){
        buffer += "%"+(register)+" = getelementptr inbounds ["+(size+1)+" x i8], ["+(size+1)+" x i8]* %"+(mappedRegisterName)+", i64 0, i64 0\n";
        register++;
        addTextDependOnScope();
    }

    public static void printf_string(){
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i64 0, i64 0), i8* %"+(register-1)+")\n";
        register++;
        addTextDependOnScope();
    }
}

