package src.javastreams;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,id,score ");
        String name = sc.next();
        int id = sc.nextInt();
        double score = sc.nextDouble();
        System.out.println("Name: " + name + ", id: " + id + ", score: " + score);

    }
}
