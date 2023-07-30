package src.javastrings;

public class MyImmutable {
    int x;

    public MyImmutable(int x) {
        this.x = x;
    }

    public MyImmutable modify(int x) {
        if (this.x == x) {
            return this;
        } else {
            return new MyImmutable(x);
        }
    }

    public static void main(String[] args) {
        MyImmutable mi1 = new MyImmutable(2);
        MyImmutable mi2 = mi1.modify(2);
        System.out.println(mi1 == mi2);
    }
}
