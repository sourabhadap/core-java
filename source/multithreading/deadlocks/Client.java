package source.multithreading.deadlocks;

public class Client implements Runnable{

    FirstResource firstResource = new FirstResource();
    SecondResource secondResource = new SecondResource();

    public Client() {
        new Thread(this).start();
        secondResource.method1(firstResource);
    }

    public static void main(String[] args) {
        new Client();
    }

    @Override
    public void run() {
        firstResource.method1(secondResource);
    }
}
