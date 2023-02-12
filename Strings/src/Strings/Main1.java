package Strings;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "Serg";                     // literal - pool
        String s2 = "Serg";
        String s3 = new String("Serg");
        String s4 = new String("Serg");

//        int a = 4;
//        String i = "";
//        i += a;

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2));
        StringBuilder serg = new StringBuilder("Serg");
        System.out.println(serg.toString().equals(s2));

        System.out.println(s3 == s4); // false
        System.out.println(s1 == s4); // false

        String s5 = "Serg";
        String s6 = s5;
        s5 += " Mary";
        System.out.println(s5); // s5 = Serg Mary
        System.out.println(s6); // s6 = Serg -> immutable

        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1;
        System.out.println(sb1 == sb2);

    }
}
