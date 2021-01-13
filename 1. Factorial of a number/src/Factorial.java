import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i,fact=1,num = inp.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
