package src.javastrings;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length of the string is : " + s.length());
        System.out.println("Character at index 2 is : " + s.charAt(2));
        System.out.println("Index of character 'e' is : " + s.indexOf('o'));
        System.out.println("Substring with beginning index is : " + s.substring(2));
        System.out.println("Substring from index 1 to 3 is : " + s.substring(1, 3));

        String[] arr = s.split(" ");
        for (String str : arr) {
            System.out.println(str);
        }

        System.out.println("Trimmed string is : " + s.trim());
        System.out.println("Replaced string is : " + s.replace('l', 'p'));
        System.out.println("Lowercase string is : " + s.toLowerCase());
        System.out.println("Uppercase string is : " + s.toUpperCase());
    }
}
