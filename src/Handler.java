import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        smt("hello");
        smt("hello", "hi", "hitler");

        var any = 3;
        System.out.println(any);
    }

    public static void smt(String... str) {
        System.out.println(Arrays.toString(str));
    }

}
