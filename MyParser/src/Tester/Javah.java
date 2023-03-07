package Tester;

public class Javah {
    public static void main(String[] args) {
        int a = 0;
//        while (true) {
            a = ++a;
            somePower(a);
//        }

        final CheckedFinal checkedFinal = new CheckedFinal(30);
        System.out.println("smt");
        System.out.println(checkedFinal.a);
    }

    public static double somePower(int a) {
        if(a > 0 && a % 2 != 0) {
            System.out.println("odd num");
        }
        double res = Math.pow(a, 3);

        return res;
    }
}

class CheckedFinal {
    int a;
    CheckedFinal(int a) {
        this.a = a;
    }
}