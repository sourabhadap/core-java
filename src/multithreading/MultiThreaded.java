package src.multithreading;

public class MultiThreaded extends Thread{
    public static void main(String[] args) throws InterruptedException {

        MultiThreaded obj = new MultiThreaded();
        obj.setPriority(MAX_PRIORITY);
        obj.setName("mt");
        obj.start();

        MultiThreaded obj1 = new MultiThreaded();
        obj1.setPriority(MIN_PRIORITY);
        obj.setName("mt1");
        obj1.start();

//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread.getName());

//        for (int j = 0; j < 200; j++) {
//            System.out.print("j: " + j + "\t");
//            Thread.sleep(1000);
//        }
    }

    public void run(){
//        Thread currentThread = Thread.currentThread();
//        currentThread.setName("PrintNumbers");
        System.out.println("Thread Name : " + Thread.currentThread().getName());
//        for (int i = 0; i < 200; i++) {
//            System.out.print("i: " + i + "\t");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Exception caught");
//            }
//        }
    }
}
