package src.javaArrays;

public class ArraysDemo {
    public static void main(String[] args) {

//        int arr[] = {10,20,30,40,50};
        int arr[] = new int[5];



        arr[0] = 10;
        arr[1] = new Integer(20);
        arr[2] = (int) 30.02;
        arr[3] = 'a';

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[][] matrix = new int[3][3];


    }
}
