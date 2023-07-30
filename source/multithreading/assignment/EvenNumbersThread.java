package source.multithreading.assignment;

public class EvenNumbersThread implements Runnable{

    int x;

    public EvenNumbersThread(int x) {
        this.x = x;
    }
    @Override
    public void run() {
        for(int i = 0; i <= this.x; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
