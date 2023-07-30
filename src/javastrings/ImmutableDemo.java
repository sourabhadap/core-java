package src.javastrings;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("s1 = " + s1 + " s2 = " + s2);
        // the concat method returns a new string which should be assigned to a new variable
        // the original string is not modified, but a new string is created and added in the string pool
        // the original string will be garbage collected
        s1 = s1.concat(s2);

        System.out.println("s1 = " + s1 + " s2 = " + s2);
    }
}
