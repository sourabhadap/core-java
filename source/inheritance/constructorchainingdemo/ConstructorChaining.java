package source.inheritance.constructorchainingdemo;

public class ConstructorChaining {
    int x;
    public ConstructorChaining() {
        System.out.println("No Args Super Constructor");
    }

    public ConstructorChaining(int x) {
        this();
        this.x = x;
        System.out.println("Parameterized Super Constructor");
    }
}
