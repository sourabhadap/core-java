package src.multithreading.assignment;

public class OddNumbersThread implements Runnable{

    int x;

    public OddNumbersThread(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for(int i = 0; i <= this.x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
