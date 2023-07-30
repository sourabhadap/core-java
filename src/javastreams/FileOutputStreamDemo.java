package src.javastreams;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(new File("src/javastreams/demo.txt"));
            fileOutputStream = new FileOutputStream(new File("src/javastreams/demo2.txt"));
            int data;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
