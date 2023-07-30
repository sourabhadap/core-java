package source.javastreams;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("src/javastreams/demo.txt");
            fw = new FileWriter("src/javastreams/demo2.txt");
            int ch;
            while((ch = fr.read()) != -1){
                fw.write(ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
