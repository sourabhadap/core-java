package src.multithreading.synchronization.blocks;

public class DisplayMessage {
    public void sayHello(String name) {

//        For class level lock use : synchronized (DisplayMessage.class)
//        For object level lock use : synchronized (this)
        synchronized (this){
            for (int i = 1; i <= 10; i++) {
                System.out.println("How are you " + name + "?");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } // Synchronized block

    }
}
