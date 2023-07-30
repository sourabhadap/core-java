package src.abstractions;

public abstract class BMW {

    void commonFunctionality(){
        System.out.println("Common Functionality");
    }

    abstract void accelerate();

    public static void main(String[] args) {
        System.out.println("BMW");
    }
}
