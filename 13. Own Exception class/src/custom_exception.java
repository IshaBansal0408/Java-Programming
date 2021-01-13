import java.util.Scanner;
class InvalidAgeException extends Exception
{
    static final long serialVersionUID = 1L;
    InvalidAgeException(String s)
    {
        super(s);
    }
}
public class custom_exception {

    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("You can't vote.");
        else
            System.out.println("Welcome to Vote");
    }
    public static void main(String args[]){
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter age: ");
            int age =s.nextInt();
            validate(age);
        }catch(Exception m){
            System.out.println("Exception occured: "+m);
        }
    }
}
