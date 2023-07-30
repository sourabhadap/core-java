package src.operators;

public class ShortCircuitOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean z = (x < y) && (x > y);
        System.out.println(z);
        z = (x < y) || (x > y);
        System.out.println(z);
    }
}
