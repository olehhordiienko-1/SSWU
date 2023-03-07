package smt;

public class Main {
    public static void main(String[] args) {

        int  i = 3;
 //     type
        Car  car = new Car("BMW", 7000, 300);
        System.out.println(car.maxSpeed);
        System.out.println(car.price);
        System.out.println(car.model);

        Car scar = new Car(9000);

        Car car3 = new Car();
        car3.price = 7000;
    }
}

class Car {
    String model; // null
    int price; // 0
    int maxSpeed; // 0

    Car() {

    }

    Car(int p) {
        price = p;
    }

    Car(String m, int p, int s) {
        model = m;
        price = p;
        maxSpeed = s;
    }
}
