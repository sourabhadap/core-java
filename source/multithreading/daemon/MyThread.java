package source.multithreading.daemon;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("MyThread running");
        for (int i = 1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
