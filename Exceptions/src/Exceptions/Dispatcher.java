package Exceptions;

public class Dispatcher {
    public static void main(String[] args) {
        System.out.println("Start");
        m1();
        System.out.println("End");
    }

    static void m1(){
        System.out.println("Start m1");
        try{
            m2();
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        System.out.println("End m1");
    }
    static void m2(){
        System.out.println("Start m2");
        int[] x = {200, 500, 600, 100, 1100};

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(2000 / (x[i] - 100));
                System.out.println("siu");
            } catch (ArithmeticException ae) {
                System.out.println("ArithmeticException");
//            } catch (IndexOutOfBoundsException aie) {
//                System.out.println("IndexOutOfBoundsException");
//            } catch (RuntimeException re) {
//                System.out.println("RuntimeException");
            }
        }
        System.out.println("End m2");
    }
}
