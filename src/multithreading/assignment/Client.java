package src.multithreading.assignment;

public class Client {
    public static void main(String[] args) {
        EvenNumbersThread evenNumbersThread = new EvenNumbersThread(10);
        OddNumbersThread oddNumbersThread = new OddNumbersThread(10);

        Thread evenThread = new Thread(evenNumbersThread);
        Thread oddThread = new Thread(oddNumbersThread);

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");

    }
}
