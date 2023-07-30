package source.multithreading.deadlocks;

public class SecondResource {
    public synchronized void method1(FirstResource fr){
        System.out.println("SecondResource method1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Calling FirstResource method2");
        fr.method2();
    }

    public synchronized void method2(){
        System.out.println("SecondResource method2");
    }
}
