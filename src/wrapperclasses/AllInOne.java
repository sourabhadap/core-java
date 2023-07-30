package src.wrapperclasses;

public class AllInOne {
    public static void main(String[] args) {
        int x = 10000;
        String s = Integer.toString(x);
        Integer b = new Integer(s);
        int y = b.intValue();
        Integer c = new Integer(y);
        String t = c.toString();
        Integer d = new Integer(t);
    }
}
