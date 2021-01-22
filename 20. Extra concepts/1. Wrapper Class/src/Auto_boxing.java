public class Auto_boxing {
    public static void main(String args[]) {
        System.out.println("Converting int into Integer");
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println(a + " " + i + " " + j);

        System.out.println("Converting char into Character");
        char c = 'h';
        Character ch = Character.valueOf(c);
        Character ch1 = c;
        System.out.println(c + " " + ch + " " + ch1);
    }
}
