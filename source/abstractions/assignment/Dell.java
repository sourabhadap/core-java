package source.abstractions.assignment;

public abstract class Dell implements TouchScreenLaptop{
    @Override
    public void scroll() {
        System.out.println("Scrolling on Dell");
    }
}
