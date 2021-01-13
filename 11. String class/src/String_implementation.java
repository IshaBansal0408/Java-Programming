import java.util.Scanner;

class STRING{
    public void CompStr(String s1,String s2){
        System.out.println("COMPARE "+s1+" AND "+s2);
        System.out.println(s1.compareTo(s2));
    }
    public void CalLen(String s1,String s2){
        System.out.println("For string "+ s1+ " length is: "+s1.length());
        System.out.println("For string "+ s2+ " length is: "+s2.length());
    }
    public void Lower(String s1,String s2){
        String s1lower=s1.toLowerCase();
        String s2lower=s2.toLowerCase();
        System.out.print("First String is:"+s1+"\nChanged String is:"+s1lower+"\n");
        System.out.print("Second String is:"+s2+"\nChanged String is:"+s2lower);
    }

    public void Upper(String s1,String s2){
        String s1upper=s1.toUpperCase();
        String s2upper=s2.toUpperCase();
        System.out.print("First String is:"+s1+"\nChanged String is:"+s1upper+"\n");
        System.out.print("Second String is:"+s2+"\nChanged String is:"+s2upper);
    }

    public void RepLet(String s1,String s2){
        System.out.println("First Original String --> "+s1);
        String replaceString=s1.replace('L','Z');
        System.out.println("Changed String --> "+replaceString);

        System.out.println("Second Original String --> "+s2);
        replaceString=s2.replace('L','Z');
        System.out.println("Changed String --> "+replaceString);
    }
    public void check(String s1,String s2){
        System.out.println("First Original String --> "+s1);
        System.out.println("Contains 'h': " + s1.contains("h"));
        System.out.println("Contains 'l': " +s1.contains("l"));
        System.out.println("Contains 'e': " +s1.contains("e"));

        System.out.println("Second Original String --> "+s2);
        System.out.println("Contains 'h': " + s2.contains("h"));
        System.out.println("Contains 'l': " +s2.contains("l"));
        System.out.println("Contains 'e': " +s2.contains("e"));

    }
    public void Ccat(String s1,String s2){
        String s3=s1.concat(" "+s2);
        System.out.println("First String : "+s1);
        System.out.println("Second String : "+s2);
        System.out.println("Final String : "+s3);
    }
}

public class String_implementation{

    public static void main(String args[]){
        System.out.println("The program performs the following things:");
        System.out.println("1. COMPARE TWO STRINGS");
        System.out.println("2. CALCULATE LENGTH OF TWO STRINGS");
        System.out.println("3. CONVERT TO LOWER CASE");
        System.out.println("4. CONVERT TO UPPER CASE");
        System.out.println("5. REPLACE 'L' WITH 'Z' ");
        System.out.println("6. CHECK IF 'h' AND 'e' ARE PRESENT OR NOT");
        System.out.println("7. CONCATENATION OF STRING");
        System.out.println("\n");
        Scanner inp = new Scanner(System.in);
        STRING s=new STRING();
        System.out.print("Enter first string: ");
        String s1=inp.nextLine();
        System.out.print("Enter second string: ");
        String s2=inp.nextLine();
        System.out.println("\n\tCOMPARE TWO STRINGS");
        s.CompStr(s1,s2);
        System.out.println("\n\n\tCALCULATE LENGTH OF TWO STRINGS");
        s.CalLen(s1,s2);
        System.out.println("\n\n\tCONVERT TO LOWER CASE");
        s.Lower(s1,s2);
        System.out.println("\n\n\tCONVERT TO UPPER CASE");
        s.Upper(s1,s2);
        System.out.println("\n\n\tREPLACE 'L' WITH 'Z' ");
        s.RepLet(s1,s2);
        System.out.println("\n\n\tCHECK IF PRESENT OR NOT");
        s.check(s1,s2);
        System.out.println("\n\n\tCONCATENATION OF STRING");
        s.Ccat(s1,s2);
    }}
