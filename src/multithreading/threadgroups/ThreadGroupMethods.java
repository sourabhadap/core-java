package src.multithreading.threadgroups;

public class ThreadGroupMethods {
    public static void main(String[] args) {
        ThreadGroup mtg = new ThreadGroup("MyThreadGroup");

        CustomThread ct1 = new CustomThread(mtg, "CustomThread1");
        CustomThread ct2 = new CustomThread(mtg, "CustomThread2");
        CustomThread ct3 = new CustomThread(mtg, "CustomThread3");

        ct1.start();
        ct2.start();
        ct3.start();

        System.out.println(mtg.activeCount());

        mtg.list();
    }
}
