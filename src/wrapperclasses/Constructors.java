package src.wrapperclasses;

public class Constructors {
    public static void main(String[] args) {
        long l = 10000;
        Long a = new Long(l);
        String s = "2000";
        Long b = new Long(s);

        System.out.println(a);
        System.out.println(b);
    }
}
