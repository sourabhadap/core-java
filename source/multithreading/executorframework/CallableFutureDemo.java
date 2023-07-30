package source.multithreading.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        CallableDemo[] cb = {new CallableDemo(10), new CallableDemo(20), new CallableDemo(30), new CallableDemo(40), new CallableDemo(50)};

        ExecutorService es = Executors.newFixedThreadPool(3);

        for (CallableDemo callableDemo : cb) {
            Future<Integer> ft = es.submit(callableDemo);

            try {
                System.out.println(ft.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        es.shutdown();
    }
}
