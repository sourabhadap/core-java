package source.exceptions;

public class DivideNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block");
        }
    }
}
