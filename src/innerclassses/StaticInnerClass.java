package src.innerclassses;

public class StaticInnerClass {

    static void f1(){
        System.out.println("Outer static method");
    }

    static class Inner{
        static void f2(){
            System.out.println("Inner static method");
        }

        void f3(){
            System.out.println("Inner non-static method");
        }
    }
    public static void main(String[] args) {
        StaticInnerClass.f1();
        StaticInnerClass.Inner.f2();

        StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
        obj.f3();
    }
}
