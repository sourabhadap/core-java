package source.polymorphism;

public class RunTimeBinding {
    public static void main(String[] args) {
        AppleLaptop macBook = new MacBook();
        macBook.start();
        macBook.shutdown();

        AppleLaptop macBookPro = new MacBookPro();
        macBookPro.start();
        macBookPro.shutdown();

        AppleLaptop macBookAir = new MacBookAir();
        macBookAir.start();
        macBookAir.shutdown();
    }
}
