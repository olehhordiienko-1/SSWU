package somePack;

public class InnerClass {
    int i;
    public static void main(String[] args) {
        new InnerClass().foo();
    }
    void foo() {
        Inner i1 = new Inner();
        i1.some();
        System.out.println(i);
        Inner i2 =new Inner();
        i2.some();
        System.out.println(i);
    }

    class Inner {
        void some() {
            i++;
        }
    }
}
