package source.exceptions;

public class StringParser {
    public static void main(String[] args) {
        String s = "fujjgv";
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        }catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
