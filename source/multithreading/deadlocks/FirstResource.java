package source.multithreading.deadlocks;

public class FirstResource {

    public synchronized void method1(SecondResource sr){
        System.out.println("FirstResource method1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Calling SecondResource method2");
        sr.method2();
    }

    public synchronized void method2(){
        System.out.println("FirstResource method2");
    }
}
