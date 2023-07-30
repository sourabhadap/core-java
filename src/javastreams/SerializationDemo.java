package src.javastreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/javastreams/emp.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Employee emp = new Employee( "John Doe",101, 10000, "Manager",32434);
        oos.writeObject(emp);
    }
}
