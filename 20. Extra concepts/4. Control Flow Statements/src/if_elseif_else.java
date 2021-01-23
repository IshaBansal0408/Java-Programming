import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int n1=inp.nextInt();
        int n2=inp.nextInt();
        if(n1>n2){
            System.out.print(n1+">"+n2);
        }
        else if(n1<n2){
            System.out.print(n2+">"+n1);
        }
        else{
            System.out.print(n1+"=="+n2);
        }
    }
}
