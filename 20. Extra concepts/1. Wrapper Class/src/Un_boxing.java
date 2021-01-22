public class Un_boxing {
    public static void main(String args[]) {
        System.out.println("Converting Integer to int");
        Integer a = new Integer(3);
        int i = a.intValue();
        int j = a;
        System.out.println(a + " " + i + " " + j);

        System.out.println("Converting Character to char");
        Character ch = new Character('h');
        char ch1 = ch.charValue();
        int ch2 = ch;
        System.out.println(ch + " " + ch1 + " " + ch2);
    }
}