public class Thread_class extends Thread {
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());
        System.out.println("Creating thread...");
        Thread thread = new Thread_class();
        System.out.println("Starting thread...");
        thread.start();
    }
}