// Abstract class creation -> will extend all the other classes -> parent class
abstract class Bank
{
    double val1;
    double val2;
    Bank(double a, double b) {
        val1 = a;
        val2 = b;
    }
    // An abstract function -> will be used in all the classes that extend from this parent class
    abstract double interest_and_cost();
}

//First Bank -> SBI which is child of Bank
class SBI extends Bank
{
    SBI(double a, double b)
    {
        //it is using super -> accessing the val1 and val2 of the parent class-> will call constructor of Bank 
        super(a, b);
    }
    // use the common function declared 
    double interest_and_cost()
    {
        System.out.println("\tWelcome to SBI\n");
        System.out.println("Interest is "+val1);
        System.out.println("Cost is "+val2);
        return val2+val2*val1;
    }

}
//Second Bank
class ICICI extends Bank
{
    ICICI(double a, double b)
    {
        super(a, b);
    }
    double interest_and_cost()
    {
        System.out.println("\tWelcome to ICICI\n");
        System.out.println("Interest is "+val1);
        System.out.println("Cost is "+val2);
        return val2+val2*val1;
    }
}
//Third Bank 
class YES extends Bank {
    YES(double a, double b)
    {
        super(a, b);
    }
    double interest_and_cost()
    {
        System.out.println("\tWelcome to YES Bank\n");
        System.out.println("Interest is "+val1);
        System.out.println("Cost is "+val2);
        return val2+val2*val1;
    }
}
//Fourth Bank
class AXIS extends Bank {
    AXIS(double a, double b)
    {
        super(a, b);
    }
    double interest_and_cost()
    {
        System.out.println("\tWelcome to AXIS Bank\n");
        System.out.println("Interest is "+val1);
        System.out.println("Cost is "+val2);
        return val2+val2*val1;
    }
}

public class Abstract_method_n_classes {

    public static void main(String args[])
    {
        System.out.println("WELCOME TO BANK DATABASE\n\n ");

        //creating objects of each bank
        SBI r = new SBI(5, 5000);
        ICICI t = new ICICI(10, 8000);
        YES s = new YES(20,1000);
        AXIS u = new AXIS(30,23000);

        //creating an object of parent class -> abstract class
        Bank b1;

        //using abstract class with all the child classes
        b1 = r;
        System.out.println("Total cost is " + b1.interest_and_cost()+"\n");
        b1 = t;
        System.out.println("Total cost is " + b1.interest_and_cost()+"\n");
        b1 = s;
        System.out.println("Total cost is " + b1.interest_and_cost()+"\n");
        b1 = u;
        System.out.println("Total cost is " + b1.interest_and_cost()+"\n");
    }
}