package src.polymorphism;

public class MacBookAir extends MacBook{
    @Override
    public void start(){
        System.out.println("MacBookAir started");
    }

    @Override
    public void shutdown(){
        System.out.println("MacBookAir shutdown");
    }
}
