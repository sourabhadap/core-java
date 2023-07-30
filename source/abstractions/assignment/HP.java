package source.abstractions.assignment;

public abstract class HP implements TouchScreenLaptop{
    @Override
    public void scroll() {
        System.out.println("Scrolling on HP");
    }
}
