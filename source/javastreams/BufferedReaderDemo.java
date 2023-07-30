package source.javastreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;

        fr = new FileReader("src/javastreams/demo.txt");
        br = new BufferedReader(fr);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
                count++;
            }
        }
        System.out.println("Total words: " + count);
        br.close();
        fr.close();
    }
}
