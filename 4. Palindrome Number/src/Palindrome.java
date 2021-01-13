import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner inp= new Scanner(System.in);
        int r,sum=0,temp;
        System.out.print("Enter the number: ");
        int n= inp.nextInt();
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Yes it is a Palindrome number");
        else
            System.out.println("No it is not a Palindrome number");
    }
}
