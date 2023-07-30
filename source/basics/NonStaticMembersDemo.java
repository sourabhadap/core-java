package source.basics;

public class NonStaticMembersDemo {
    int num;
    NonStaticMembersDemo() {
        System.out.println("Constructor");
    }
    {
        System.out.println("Non-static block");
    }

    public static void main(String[] args) {
        NonStaticMembersDemo nonStaticMembersDemo = new NonStaticMembersDemo();
        nonStaticMembersDemo.doSomething();

    }

    static {
        System.out.println("Static block");
    }

    void doSomething() {
        System.out.println("Non-static doSomething method");
    }

}
