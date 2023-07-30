package src.javastrings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hola");
        char[] c = {'H', 'e', 'l', 'l', 'o','!'};
        String s4 = new String(c);
        byte b[] = {65, 66, 67, 68, 69, 70};
        String s5 = new String(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        // JVM stores string literals in a string pool and reuses them

    }
}
