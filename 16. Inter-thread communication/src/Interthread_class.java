class Customer{
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("WELCOME TO THE PAYMENT COUNTER");
        if(this.amount<amount){
            System.out.println("You have -- "+this.amount);
            System.out.println("YOU DON'T HAVE ENOUGH MONEY....GO TO NEAREST ATM....\n");
            try{
                wait();
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("Welcome back to the counter...");
        System.out.println("Payment in progress...\n");
        System.out.println("Payment successful! Thank you for coming..");
    }
    synchronized void deposit(int amount){
        System.out.println("WELCOME TO ATM");
        System.out.println("MONEY WITHDRAWING IN PROGRESS");
        this.amount+=amount;
        System.out.println("MONEY WITHDRAWL SUCCESSFUL");
        System.out.println("Now the amount is -- "+this.amount+"\n");

        notify();
    }
}
public class Interthread_class{
    public static void main(String args[]){
        Customer c=new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();
    }

}