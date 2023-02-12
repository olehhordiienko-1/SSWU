package Overloads;

public class Handler {
    public static void main(String[] args) {
//        display(5, 6);
//        display(3.1, 7.3);
        String s = "JAVA FOREVER"; // indexOf A?
        System.out.println(s.indexOf('A', 2));

    }

    static void display(int x, int y) {
        System.out.println(x * y);
    }

    static void display(double x, double y) {
        System.out.println(x + y);
    }
}
