package src.javastreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "Hello,World!,I,am,learning,Java.";
        StringTokenizer st = new StringTokenizer(s, ",",true);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
