package Wrappers;

public class Main1 {
    public static void main(String[] args) {
        int x = 5;
        Integer i1 = x; // Integer i1 = new Integer(x); autoboxing
        Integer i2 = 3;
        Integer i3 = i1 + i2;   // 5 + 3
        i3++;

        Integer i4 = 100;
        Integer i5 = i4;
        i4++;
//        System.out.println(i4); // 101
//        System.out.println(i5); // 100??? - immutable as String

        Integer i6 = 100;
        Integer i7 = 100;
        if(i6 < 10) {
            System.out.println();
        }
//        Integer i8 = new Integer(100);
//        Integer i9 = new Integer(100);
////
//        System.out.println(i6 == i7); // true -> pool as String
//        System.out.println(i6 == i8); // false
//        System.out.println(i7 == i8); // false

        Integer i10 = 150; // false, because not in pool
        Integer i11 = 150; //
//        System.out.println(i10 == i11);

        System.out.println(i10.equals(i11));
        int z = 300;
        a(z);
        byte b = 120;
        Byte b1 = new Byte(b);
        System.out.println(b1);
    }

    private static void a(Integer a) {
        System.out.println(a);
    }
}
