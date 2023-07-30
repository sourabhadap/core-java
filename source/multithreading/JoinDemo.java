package source.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n,sum = 0;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("Sum of first n numbers :");
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        JoinDemo.n = sc.nextInt();

        JoinDemo obj = new JoinDemo();
        obj.start();

        try {
            obj.join();
            System.out.println("Sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start)/1000 + " s");
    }

    public void run(){
        for (int i = 1; i <= JoinDemo.n; i++) {
            JoinDemo.sum += i;
        }
    }
}
