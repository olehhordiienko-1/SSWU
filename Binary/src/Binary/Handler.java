package Binary;

public class Handler {
    public static void main(String[] args) {
//        int d1 = 725;           // decimal
//        int b1 = 0b10_1101_0101;  // binary
//        int h1 = 0x2D5;           // hexadecimal
//        System.out.println(d1);
//        System.out.println(b1);
//        System.out.println(h1);
//
//        int b2 = 0b100_011_101;
//        int o2 = 0435;       // octal
//        System.out.println(b2);
//        System.out.println(o2);
        int i1 = 1000000000;
        long i2 = 1500000000;
        System.out.println(i1 + i2);
    }
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// 10110 bin -> 16 4 2 =    22 dec
// 11011 bin -> 16 8 2 1 =  27 dec
// -----
//  110001 bin -> 32+16+1 = 49 dec
//
// 0    0   1   1
// 0    1   0   1
// --   --  --  --
// 0    1   1   10
//
// Formula Gornera:
// 1864 = 1 * 1000 + 8 * 100 + 6 * 10 + 4 * 1 = 1 * 10^3 + 8 * 10^2 + 6 * 10^1 + 4 * 10^0
// 3 2 1 0
// 1011010101 = 1 * 2^9 + 0 * 2^8 + 1 * 2^7 + 1 * 2^6 + 0 * 2^5 + 1 * 2^4 + 0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0
// 9876543210 = 2^9 + 2^7 + 2^6 + 2^4 + 2^2 + 2^0
//              512 + 128 + 64 + 16 + 4 + 1 = 725
// 285 dec = 100011101 bin
// 285 1
// 142 0
// 71  1
// 35  1
// 17  1
// 8   0
// 4   0
// 2   0
// 1   1