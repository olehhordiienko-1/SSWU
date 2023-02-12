package Static.FixCar;

public class Dispatcher {
    public static void main(String[] args) {
        Car bentley = new Car("Black", "Bentley", true, 8887, "John");
        Driver driverBentley = new Driver("John", 27, bentley);
        driverBentley.fixCar();
        AutoServiceStation.fixCar(bentley);
    }
}
