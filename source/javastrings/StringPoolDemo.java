package source.javastrings;

public class StringPoolDemo {
    public static void main(String[] args) {

        User user1 = new User(1, "John");
        User user2 = new User(2, "John");

        System.out.println(user1.name.hashCode());
        System.out.println(user2.name.hashCode());

        String s1 = "John";
        String s2 = "John";
        String s3 = new String("John");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // All the strings point to the same memory location
        // in the string pool

        System.out.println(s1 == s2); // true checks if the references are equal
        System.out.println(s1.equals(s2)); // true checks if the values are equal
        System.out.println(s1 == s3); // false because s3 is a new object
        System.out.println(s1.equals(s3)); // true because the values are equal


    }
}
