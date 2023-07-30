package src.multithreading.executorframework;

public class ExecutorDemo implements Runnable {

    String name;

    public ExecutorDemo(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Processing check for " + this.name);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Check processed for " + this.name);
    }
}
