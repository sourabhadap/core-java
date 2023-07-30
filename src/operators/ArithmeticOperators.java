package src.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("x + y = " + z);
        z = x - y;
        System.out.println("x - y = " + z);
        z = x * y;
        System.out.println("x * y = " + z);
        z = x / y;
        System.out.println("x / y = " + z);
        z = x % y;
        System.out.println("x % y = " + z);
        z = x++;
        System.out.println("x++ = " + z);
        z = ++x;
        System.out.println("++x = " + z);
        z = x--;
        System.out.println("x-- = " + z);
        z = --x;
        System.out.println("--x = " + z);
    }
}
