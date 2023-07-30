package src.multithreading.synchronization.classlock;

public class SynchronizationDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread( "Dhoni");
        MyThread t2 = new MyThread( "Yuvraj");
        t1.start();
        t2.start();
    }
}
