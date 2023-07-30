package src.multithreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorDemo[] executorDemos = {new ExecutorDemo("ATM"), new ExecutorDemo("Bank"), new ExecutorDemo("Cashier"),
                new ExecutorDemo("Customer"), new ExecutorDemo("Teller")};

        ExecutorService es = Executors.newFixedThreadPool(4);

        for (ExecutorDemo executorDemo : executorDemos) {
            es.execute(executorDemo);
        }

        es.shutdown();
    }
}
