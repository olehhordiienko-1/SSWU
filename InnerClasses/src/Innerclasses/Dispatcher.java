package Innerclasses;

public class Dispatcher {

    public static void main(String[] args) {
        Object o = new Outer();
        Outer test = (Outer) o;
        System.out.println(test.x);


        Outer.Inner i = new Outer().new Inner();
        i.display();
        Outer outer = new Outer(){};
        (new Outer(){}).m();
//        Outer.Inner b2 = new outer.Inner();

        Outer xuy = new Outer() {
            String s;
        };
    }
}

class Outer {       // top-level class
    int x = 10;
    static int z = 20;

    class Dispatcher {
        int qqe = 300;
    }
    void m(){
        int i = 50;
        class InnerLocal{
            int qq = 34;
            void display() {
                System.out.println(i);
            }
        }

        InnerLocal i1 = new InnerLocal();
        i1.display();
    }

    public class Inner {   // inner class
        int x = 20;
        void display() {
            System.out.println(this.x);
            System.out.println(Outer.this.x);
            Outer.this.m();
        }
    }

    static class InnerStatic {
        void d() {
            System.out.println(z);

        }

    }
}
