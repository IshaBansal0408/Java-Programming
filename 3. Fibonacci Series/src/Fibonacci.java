import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner inp=new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i;
        System.out.print("Enter the number of elements:");
        int n = inp.nextInt();
        System.out.print("Your series is as follows:");
        System.out.print(n1 + " " + n2);
        for (i = 2;i<n;++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}