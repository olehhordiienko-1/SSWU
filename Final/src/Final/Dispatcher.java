package Final;

public class Dispatcher{
    final static int  x = 30;
    public static void main(String[] args) {
//        final int x = 10;
//        x++;
        Test t = new Test();
        final Test siu;
        siu = new Test();
        t.a = 60;
        t.a = 30;


    }

    void change() {
//        Dispatcher.x = 3032;
    }
}

final class Test {
    int a = 50;

    void say(){}
}

class Parent { //final class Parent { !! compilation error
    public void m() { //    final void m() { !!! compilation error
        System.out.println("Parent");
    }

    public final void m(int a) {

    }
}

class Child extends Parent {
    public final void m() {
        System.out.println("Child");
    }
}
