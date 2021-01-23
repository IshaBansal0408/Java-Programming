import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your symbol: ");
        String symbol =inp.next();
        switch (symbol) {
            case "+": {System.out.println("You choose addition");
                        break;}
            case "-": {System.out.println("You choose subtraction");
                break;}
            case "*": {System.out.println("You choose multiplication");
                break;}
            case "/": {System.out.println("You choose division");
                break;}
            default:{System.out.println("\n you have reached the end");
                        break;}
        }
    }
}
