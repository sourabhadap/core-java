package source.polymorphism;

public class CompileTimeBinding {

    void add(int a,int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }

    void add(int a, int b, int c){
        System.out.println("Sum of three numbers: "+(a+b+c));
    }

    void add(int a, int b, int c, int d){
        System.out.println("Sum of four numbers: "+(a+b+c+d));
    }

    public static void main(String[] args) {
        CompileTimeBinding obj = new CompileTimeBinding();
        obj.add(10, 20);
        obj.add(20, 80, 40);
        obj.add(100, 90, 60, 40);
    }
}
