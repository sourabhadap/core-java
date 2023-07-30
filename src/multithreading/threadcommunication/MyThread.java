package src.multithreading.threadcommunication;

public class MyThread extends Thread{

    int total;

    public void run(){
        System.out.println("MyThread running");

        synchronized (this){
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            this.notify();
        }
    }
}
