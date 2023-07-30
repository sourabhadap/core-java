package source.exceptions;

public class Assertions {
    public static void main(String[] args) {
        int x = 10;
        assert x == 10;
        assert x == 20 : "x should be 20";

        System.out.println("Run with -ea to enable assertions");
    }
}
