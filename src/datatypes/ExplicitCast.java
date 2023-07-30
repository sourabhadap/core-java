package src.datatypes;

public class ExplicitCast {
    public static void main(String[] args) {
        int i = 100;
        byte b = (byte)i;
        System.out.println(b);

        int x = 97;
        char ch = (char)x;
        System.out.println(ch);

        int y = 130;
        byte z = (byte)y;
        System.out.println(z);

        int a = 612;
        byte c = (byte)a;
        char d = (char)c;
        System.out.println(d);
    }
}
