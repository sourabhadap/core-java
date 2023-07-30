package source.multithreading;

public class CheckProcessor implements Runnable{
    public static void main(String[] args) {
        CheckProcessor cp = new CheckProcessor();
        Thread t1 = new Thread(cp);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Check processor started");
    }
}
