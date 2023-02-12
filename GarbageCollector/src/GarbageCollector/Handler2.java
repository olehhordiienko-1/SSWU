package GarbageCollector;

public class Handler2 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t);
        t = null;
        System.gc();
        System.out.println(Test.t);
        System.out.println(Test.t);

    }
}

class Test {
    static Test t;

    public void finalize(){
        t = this;
        System.out.println("fin");
    }
}
