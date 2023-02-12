package Tester;

public class Outer {
    private int x = 10;
    public static void main(String[] args) {
        System.out.println(new Outer().new Inner().y);

    }

    class Inner {
        public int y = new Outer().x;
    }
}
