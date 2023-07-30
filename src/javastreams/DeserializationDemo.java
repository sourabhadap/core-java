package src.javastreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/javastreams/emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp = (Employee) ois.readObject();

        System.out.println("Employee name: " + emp.name);


    }
}
