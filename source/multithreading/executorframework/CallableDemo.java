package source.multithreading.executorframework;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {

    int num;

    public CallableDemo(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" is calculating sum of "+this.num+" numbers");

        int sum = 0;
        for(int i = 1; i <= this.num; i++){
            sum += i;
        }

        return sum;
    }
}
