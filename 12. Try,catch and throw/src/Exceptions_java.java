import java.util.Scanner;
public class Exceptions_java {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int i = 0;
        System.out.print("The array is: ");
        while(i<9) {
            System.out.print(arr[i]+" ");
            i += 1;
        }
        System.out.print("\nThe index are:");
        i=0;
        while(i<9) {
            System.out.print(i+" ");
            i += 1;
        }
        System.out.println("\nEnter the index of element you want to display: ");
        int num1=s.nextInt();
        try {
            System.out.println("Result is "+arr[num1]);
        }catch(Exception a)
        {
            System.out.println("Exception occured ");
        }finally {
            System.out.println("You have reached the end of the program!");
        }
    }
}