package src.javastreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("src/javastreams/demo.txt"));
            System.out.println("File opened successfully");

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
                System.out.println("\nFile closed successfully");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
