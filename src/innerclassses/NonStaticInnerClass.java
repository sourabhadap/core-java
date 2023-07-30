package src.innerclassses;

public class NonStaticInnerClass {
    void f1(){
        System.out.println("Outer non-static method");
    }

    class Inner{
        void f2(){
            System.out.println("Inner non-static method");
        }
    }

    public static void main(String[] args) {
        NonStaticInnerClass obj = new NonStaticInnerClass();
        obj.f1();

        NonStaticInnerClass.Inner obj2 = obj.new Inner();
        obj2.f2();
    }
}
