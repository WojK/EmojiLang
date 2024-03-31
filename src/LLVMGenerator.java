import java.util.Stack;

public class LLVMGenerator {
    static String header_text = "";
    static String main_text = "";
    static int register = 1;
    static int br = 0;


    static Stack<Integer> brstack = new Stack<Integer>();


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
        main_text += "%"+ register +" = load i32, i32* %"+id+"\n";
        register++;
        main_text += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(register -1)+")\n";
        register++;
    }

    static void printf_double(String id){
        main_text += "%"+ register +" = load double, double* %"+id+"\n";
        register++;
        main_text += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(register -1)+")\n";
        register++;
    }

    static void printf_value_i32(String value) {
        main_text += "%"+ register +" = alloca i32\n";
        register++;
        main_text += "store i32 "+ value +", i32* %"+ (register - 1) +"\n";
        main_text += "%"+ register +" = load i32, i32* %"+ (register - 1) +"\n";
        register++;
        main_text += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+ (register - 1) +")\n";
        register++;
    }


    static void printf_value_double(String value) {
        main_text += "%"+ register +" = alloca double\n";
        register++;
        main_text += "store double "+ value +", double* %"+ (register - 1) +"\n";
        main_text += "%"+ register +" = load double, double* %"+ (register - 1) +"\n";
        register++;
        main_text += "%"+ register +" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+ (register - 1) +")\n";
        register++;
    }

    static void load_i32(String id){main_text += "%"+register+" = load i32, i32* %"+id +"\n"; register++;}
    static void load_double(String id){main_text += "%"+register+" = load double, double* %"+id+"\n"; register++;}

    static void declare_i32(String id){
        main_text += "%"+id+" = alloca i32\n";
    }

    static void declare_double(String id){
        main_text += "%"+id+" = alloca double\n";
    }

    static void assign_i32(String id, String value){
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assign_double(String id, String value){
        main_text += "store double "+value+", double* %"+id+"\n";
    }

    static void scanf(String id){
        main_text += "%"+register+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %"+id+")\n";
        register++;
    }
    static void scanf_double(String id){
        main_text += "%"+register+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strd, i32 0, i32 0), double* %"+id+")\n";
        register++;
    }

    static void add_i32(String val1, String val2){
        main_text += "%"+register+" = add i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void add_double(String val1, String val2){
        main_text += "%"+register+" = fadd double "+val1+", "+val2+"\n";
        register++;
    }

    static void sub_i32(String val1, String val2){
        main_text += "%"+register+" = sub i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void sub_double(String val1, String val2){
        main_text += "%"+register+" = fsub double "+val1+", "+val2+"\n";
        register++;
    }

    static void mult_i32(String val1, String val2){
        main_text += "%"+register+" = mul i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void mult_double(String val1, String val2){
        main_text += "%"+register+" = fmul double "+val1+", "+val2+"\n";
        register++;
    }

    static void div_i32(String val1, String val2){
        main_text += "%"+register+" = sdiv i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void div_double(String val1, String val2){
        main_text += "%"+register+" = fdiv double "+val1+", "+val2+"\n";
        register++;
    }

    static void ifstart(){
        br++;
        main_text += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        main_text += "true"+br+":\n";
        brstack.push(br);
    }

    static void ifend(){
        int b = brstack.pop();
        main_text += "br label %false"+b+"\n";
        main_text += "false"+b+":\n";
    }

    static void icmp_i32(String v1, String v2){
        main_text += "%"+register+" = icmp eq i32 "+v1+", "+v2+"\n";
        register++;
    }
    static void icmp_double(String v1, String v2){
        main_text += "%"+register+" = fcmp oeq double "+v1+", "+v2+"\n";
        register++;
    }

    static void repeatstart(String repetitions){
        declare_i32(Integer.toString(register));
        int counter = register;
        register++;
        assign_i32(Integer.toString(counter), "0");
        br++;
        main_text += "br label %cond"+br+"\n";
        main_text += "cond"+br+":\n";

        load_i32(Integer.toString(counter));
        add_i32("%"+(register-1), "1");
        assign_i32(Integer.toString(counter), "%"+(register-1));

        main_text += "%"+register+" = icmp slt i32 %"+(register-2)+", "+repetitions+"\n";
        register++;

        main_text += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        main_text += "true"+br+":\n";
        brstack.push(br);
    }

    static void repeatend(){
        int b = brstack.pop();
        main_text += "br label %cond"+b+"\n";
        main_text += "false"+b+":\n";
    }
}
