package source.exceptions;

public class MultiCatch {

    public static void main(String[] args) {
        try {
            String input = args[0];
            int num = Integer.parseInt(input);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input");
        }
    }
}
