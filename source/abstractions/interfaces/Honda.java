package source.abstractions.interfaces;

public class Honda implements Car{
    @Override
    public void ride() {
        System.out.println("Honda Ride");
    }

    @Override
    public void stop() {
        System.out.println("Honda Stop");
    }
}
