package Static.FixCar;

public class AutoServiceStation {
    static void fixCar(Car car) {
        System.out.println("Preliminary actions...");
        System.out.println(car.carModel + " with number "+ car.carNumber
                + " was fixed.");
    }
}
