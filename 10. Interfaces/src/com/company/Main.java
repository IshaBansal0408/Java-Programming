package com.company;
interface MoneyIn {
    void in();
}
interface MoneyOut {
    void out();
}
class Money implements MoneyIn, MoneyOut {
    public void in() {
        System.out.println("Money Sent");
    }
    public void out() {
        System.out.println("Money Taken Out");
    }
}
public class Main {

    public static void main(String[] args) {
        Money a = new Money();
        a.in();
        a.out();
    }
}
