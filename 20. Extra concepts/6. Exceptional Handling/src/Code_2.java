import com.sun.org.apache.bcel.internal.classfile.Code;

public class Code_2{
    public int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;
    }
    public static void main(String args[]){
        Code_2 obj = new Code_2();
        try{
            System.out.println(obj.division(15,0));
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide number by zero");
        }
    }
}