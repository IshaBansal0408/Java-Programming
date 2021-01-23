
//Private Access Modifier
class A{
    private int data = 10;
    System.out.println("Data:=" + data);
}

public class Class_2{
    public static void main(String args[]){
        A obj = new A();
        System.out.println(obj.data);
    }
}  