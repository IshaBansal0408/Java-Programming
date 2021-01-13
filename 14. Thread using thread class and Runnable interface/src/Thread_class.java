class exercise extends Thread {
    exercise(){
        super("Demo Thread");
        System.out.println("Exercise number: " + this);
        start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Exercise number: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exercise interrupted.");
        }
        System.out.println("Stopping Exercise! 5 done!");
    }
}
public class Thread_class {
    public static void main(String args[]) {
        new exercise();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Day number " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Days interrupted.");
        }
        System.out.println("5 days completed!");
    }
}