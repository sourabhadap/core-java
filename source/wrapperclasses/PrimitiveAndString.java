package source.wrapperclasses;

public class PrimitiveAndString {
    public static void main(String[] args) {
        byte x = 100;
        String s = Byte.toString(x);
        Byte.parseByte(s);
    }
}
