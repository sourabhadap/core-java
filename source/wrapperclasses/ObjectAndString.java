package source.wrapperclasses;

public class ObjectAndString {
    public static void main(String[] args) {
        long x = 10000;
        Long y = Long.valueOf(x);
        String s = y.toString();
        Long z = Long.valueOf(s);
    }
}
