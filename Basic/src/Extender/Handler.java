package Extender;

public class Handler {
    public static void main(String[] args) {
//        byte x = 10;
//        x = (byte)(x + 5);
//        x += 5;
//        System.out.println(x);
        ///// increment /////
        byte y = 10;
//        y = y + 1;
//        ++y; prefix
//        y++; // postfix
//        System.out.println(y);
        int a = 10;
//        int b = a++; // postfix
//        int c = 10;
//        int d = ++c; // prefix
//        System.out.println("a = " + a); // 11
//        System.out.println("b = " + b); // 10
//        System.out.println("c = " + c); // 11
//        System.out.println("d = " + d); // 11

//        int z = 10;
//        z = ++z; // 11
//        ++z;     // 11
//        z++;     // 11
//        z = z++;
//        System.out.println(z);

        //// if-else -> ternary operator ////
//        int x = 20;
//        x = x < 0? --x : ++x;
//      1 = 2 bool? 3 : 4;
//      1 = 3, 2 = true
//      1 = 4, 2 = false
//        System.out.println(x);
        //// XOR ////
//  x1  x2  and  or  xor
//  f   f    f   f    f
//  f   t    f   t    t
//  t   f    f   t    t
//  t   t    t   t    f
        boolean b = true;
//        System.out.println(b ^ false);
//        short cirquit && ||
        boolean haveMoney = false;
        boolean haveFriends = true;
        if(haveMoney && haveFriends) {
            System.out.println("I am going to cinema");
        } else {
            System.out.println("I stay at home");
        }
    }
}
