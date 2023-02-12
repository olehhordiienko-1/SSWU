package Static2;

public class Handler {
    int y = 20;

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        Handler h1 = new Handler();
        System.out.println(h1.y);
    }
}
