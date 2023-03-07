package Packages.Package1;

// import Sigma.Software.Packages.Package2.Test2; // first import for Test2
// import Sigma.Software.Packages.Package2.Test3; // second
import Packages.Package2.Test2;
import Packages.Package2.Test3;

public class Dispatcher {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.x1);
        System.out.println(Test1.x3);

        Test2 t2 = new Test2();
        System.out.println(t2.a1);
        System.out.println(Test2.a3);

        Test3 t3 = new Test3();

    }
}

class Test1 {
    int x1 = 150;
    int x2 = 250;
    static int x3 = 350;
    static int x4 = 450;
}