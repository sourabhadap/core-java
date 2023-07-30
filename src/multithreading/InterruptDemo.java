package src.multithreading;

public class InterruptDemo extends Thread{
    public static void main(String[] args) {
        InterruptDemo t = new InterruptDemo();
        t.start();
        t.interrupt();

    }

    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Lazy Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        }
    }
}
