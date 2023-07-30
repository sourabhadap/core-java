package src.abstractions.finalconcepts;

public class A {
    final static float pi = 3.14f;

    public void displayValue(){
        System.out.println("Value of pi is: " + pi);
    }

    public static void main(String[] args) {
        System.out.println(A.pi);
//        a.pi = 3.17879f;
//        System.out.println(a.pi);
    }
}
