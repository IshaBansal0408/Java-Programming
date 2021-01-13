import java.util.Stack;

public class Stack {
    public static void Options(){
        System.out.println("Implementing Stack");
        System.out.println("1. Push Element");
        System.out.println("2. Pop Element");
        System.out.println("3. Top Element");
        System.out.println("4. Print the Stack");
        System.out.println("5. Exit the program");
        System.out.print("Choose your Option: ");
    }
        public static void main(String a[]){
            Stack<Integer> stack = new Stack<>();
            System.out.println("Empty stack : "  + stack);
            System.out.println("Empty stack : "  + stack.isEmpty());
            stack.push(1001);
            stack.push(1002);
            stack.push(1003);
            stack.push(1004);
            System.out.println("Non-Empty stack : "  + stack);
            System.out.println("Non-Empty stack: Pop Operation : "  + stack.pop());
            System.out.println("Non-Empty stack : After Pop Operation : "  + stack);
            System.out.println("Non-Empty stack : search() Operation : "  + stack.search(1002));
            System.out.println("Non-Empty stack : "  + stack.isEmpty());
        }
    }
