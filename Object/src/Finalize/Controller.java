package Finalize;

public class Controller {
    public static void testingOverridingFinalize() {
        Car car1 = new Car("BMW", true);
        Car car2 = new Car("Opel", true);
        Car car3 = new Car("Kia", true);

        car1 = null;
        car2 = null;
        car3 = null;

        System.gc();
    }
}
