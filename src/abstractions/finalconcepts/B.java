package src.abstractions.finalconcepts;

public class B extends A{
    @Override
    public void displayValue(){
        System.out.println("Value of pi is: " + pi);
    }

    public static void main(String[] args) {
        B b = new B();
        b.displayValue();
    }
}
