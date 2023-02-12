package Lambda;

public class Handler2 {
    public static void main(String[] args) {
        I1 c = new Child();
        I1.m3();
//        I2.m3();
    }
}

interface I1 {
    void m1();
    default void m2() {
        System.out.println("m2 I1");
    }
    static void m3() {
        System.out.println("m3 I1");
    }
}

interface I2 {
}

interface I3 {
    default void m2(){
        System.out.println("m2 I3");
    }
}

class Parent {
    public void m2() {
        System.out.println("m2 Parent");
    }
}

class Child extends Parent implements I1, I3 {
    public void m1() {
        System.out.println("m1 Child");
    }

//    public void m2() {
//        System.out.println("m2 Child");
//    }
}