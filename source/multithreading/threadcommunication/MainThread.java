package source.multithreading.threadcommunication;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        synchronized (myThread) {
            try {
                System.out.println("Waiting for myThread to complete...");
                myThread.wait();
                System.out.println(myThread.total);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
