package source.abstractions.interfaces;

public class Client {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.ride();
        honda.stop();
    }
}
