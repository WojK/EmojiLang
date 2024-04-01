import java.util.Stack;

public class LLVMGenerator {
    static String header_text = "";
    static String main_text = "";

    static String buffer = "";

    static int register = 1;
    static int br = 0;

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
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strd = constant [4 x i8] c\"%lf\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }
    static void printf_i32(String id){
        buffer += "%"+ register +" = load i32, i32* %"+id+"\n";
        register++;
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(register -1)+")\n";
        register++;
        addTextDependOnScope();
    }

    static void printf_double(String id){
        buffer += "%"+ register +" = load double, double* %"+id+"\n";
        register++;
        buffer += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(register -1)+")\n";
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

    static void declare_i32(String id){
        buffer += "%"+id+" = alloca i32\n";
        addTextDependOnScope();
    }

    static void declare_double(String id){
        buffer += "%"+id+" = alloca double\n";
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

    static void enterFunction(String name, String retType, String[] args, String[] argsTypes ){
        buffer += "define "+retType+" @"+name+"(";
        for(int i = 0; i < args.length; i++){
            if(argsTypes[i].equals("int")){
                buffer += "i32 %"+args[i];
            }else if(argsTypes[i].equals("real")){
                buffer += "double %"+args[i];
            }
            if(i != args.length-1){
                buffer += ", ";
            }
        }
        buffer += ") {\n";
        addTextDependOnScope();
    }

    static void exitFunction(String returnVariable, String returnVariableType){
        String mappedRetType = "";
        if(returnVariableType.equals("real")){
            mappedRetType = "double";
        }else if(returnVariableType.equals("int")){
            mappedRetType = "i32";
        }
        buffer += "%"+register + " = load " + mappedRetType + ", "+mappedRetType+"* %"+returnVariable+"\n";
        buffer += "ret " + mappedRetType + " %" +register+"\n}\n";
        register++;
        addTextDependOnScope();
    }

    static void execFunc(String id, String returnType ,String[] argsTypes, String[] argsNames){
        buffer += "%"+register+" = call "+returnType+ " @"+id+"("+")\n";
        register++;
    }
}
