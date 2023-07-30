package src.javastrings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello World! This is a StringBuffer.");
        sb.append("You can append strings to it.");

        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println(sb.charAt(3));

        StringBuffer sb1 = new StringBuffer("Hello World!");
        System.out.println(sb1.reverse());

        System.out.println(sb1.insert(6, "Java "));
        System.out.println(sb1.delete(6, 11));

    }
}
