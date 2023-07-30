package source.multithreading.synchronization;

public class SynchronizationDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread(dm, "Dhoni");
        MyThread t2 = new MyThread(dm, "Yuvraj");
        t1.start();
        t2.start();
    }
}
