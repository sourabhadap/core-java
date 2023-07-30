package src.inheritance.constructorchainingdemo;

public class ChildClass extends ConstructorChaining {
    public ChildClass() {
        this(10);
        System.out.println("ChildClass No Args Constructor");
    }

    public ChildClass(int x) {
        super(x);
        System.out.println("ChildClass Parameterized Constructor");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
    }

}
