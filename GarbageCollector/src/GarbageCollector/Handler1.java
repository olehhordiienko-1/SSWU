package GarbageCollector;

public class Handler1 {
    public static void main(String[] args) {
//        Handler c1 = new Handler();
//        c1 = new Handler();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.c = c2;
        c2.c = c3;
        c3.c = c1;

        c1 = null; // no
        c2 = null; // no
        c3 = null; // yes !
    }
}

class Car{
    Car c;
}