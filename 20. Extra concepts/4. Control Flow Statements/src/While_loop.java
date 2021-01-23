public class While_loop {
    public static void main(String[] args) {
        System.out.println("Normal While Loop");
        int counter = 0;
        while (counter < 5) {
            System.out.println("Inside the while loop, counting: " + counter);
            counter++;
        }

        System.out.println("\nDo-While Loop");
        int counter1 = 0;
        do {
            System.out.println("Inside the while loop, counting: " + counter1);
            counter1++;
        } while(counter1 < 5);
    }
}
