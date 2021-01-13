import java.util.Scanner;
public class Sum_and_avg {
    public static void main(String[] args)
    {
        int n, sum = 0;
        float average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter no. of elements:");
        n = inp.nextInt();
        int a[] = new int[n];

        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = inp.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Your final array is:");
        for(int i = 0; i < n ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nSum calculated is:"+sum);
        average = (float)sum / n;
        System.out.println("Average calculated is:"+average);
    }
}
