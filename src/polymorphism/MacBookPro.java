package src.polymorphism;

public class MacBookPro extends MacBook{
    @Override
    public void start(){
        System.out.println("MacBookPro started");
    }

    @Override
    public void shutdown(){
        System.out.println("MacBookPro shutdown");
    }
}
