class Exercise implements Runnable {
    Thread t;
    Exercise() {
        t = new Thread(this, "Exercise Thread");
        System.out.println("Exercise Begin: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 7; i > 0; i--) {
                System.out.println("Exercise Number: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exercise interrupted.");
        }
        System.out.println("Exiting Exercise thread.");
    }
}
public class Runnable_class {
    public static void main(String args[]) {
        new Exercise();
        try {
            for(int i = 7; i > 0; i--) {
                System.out.println("Day number: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Days interrupted.");
        }
        System.out.println("Week complete.");
    }
}