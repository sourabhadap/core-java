package src.multithreading;

public class SingleThreaded {
    public static void main(String[] args) {

        SingleThreaded obj = new SingleThreaded();
        obj.printNumbers();

        for (int j = 0; j < 200; j++) {
            System.out.print("j: " + j + "\t");
        }
    }

    void printNumbers(){
        for (int i = 0; i < 200; i++) {
            System.out.print("i: " + i + "\t");
        }
    }
}
