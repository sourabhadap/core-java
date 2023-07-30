package source.polymorphism;

public class AutomaticPromotion {
//    public void print(int i){
//        System.out.println("int "+i);
//    }

    public void print(float f){
        System.out.println("float "+f);
    }

    public void print(String s){
        System.out.println("String "+s);
    }

    public void print(Object o){
        System.out.println("Object "+o);
    }

    public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print(10);
        ap.print(10.5f);
        ap.print("Hello");
    }
}
