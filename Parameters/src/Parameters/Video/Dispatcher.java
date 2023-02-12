package Parameters.Video;

public class Dispatcher {
    public static void main(String[] args) {
        Car car = new Car();
        car.price = 4000;
        car.enginePrice = 1500;
        twiceCar(car);
//        car.price = twice(car.price);
        System.out.println(car.price);
//
//        car.enginePrice = twice(car.enginePrice);
        System.out.println(car.enginePrice);
    }

    static void twiceCar(Car car) {
        car.enginePrice *= 2;
        car.price *= 2;
    }

    static int twice(int value) {
        return value = value * 2;
    }
}
