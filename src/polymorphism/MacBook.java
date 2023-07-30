package src.polymorphism;

public class MacBook implements AppleLaptop {
    public void start(){
        System.out.println("MacBook started");
    }

    public void shutdown(){
        System.out.println("MacBook shutdown");
    }
}
