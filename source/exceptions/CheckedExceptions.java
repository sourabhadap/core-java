package source.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");
    }
    public static void main(String[] args) {
        CheckedExceptions obj = new CheckedExceptions();
        try {
            obj.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
