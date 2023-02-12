package Modifiers.package1;

import Modifiers.package2.Test2;
import Modifiers.package2.Parent;

public class Dispatcher extends Parent {
    public static void main(String[] args) {
//        Math math = new Math();
        Test1 t1 = new Test1();
        System.out.println("" + t1.x1 + t1.x2 + t1.x3);

        Test2 t2 = new Test2();
        System.out.println("" + t2.z1);

//        Parent t3 = new Parent();
        Dispatcher t3 = new Dispatcher();
        System.out.println("" + t3.y1);
        System.out.println("" + t3.y2);
    }
}

class Test1 {
//    static int z = 20000;
    public      int x1 = 10;
    protected int x2 = 20;
    int x3 = 30;
    private int x4 = 40;

    void display() {
        System.out.println(x4);
    }
}