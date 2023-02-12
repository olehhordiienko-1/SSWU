package Static.FixCar;

public class Driver {
    String nameDriver;
    int ageDriver;

    Car car;
    public Driver(String name, int age, Car car) {
        nameDriver = name;
        ageDriver = age;
        this.car = car;
    }

    // не повинен був приймати таки
    void fixCar() {
        System.out.println(car.carModel + " was fixed.");
    }

    public void move() {
        System.out.println(car.carModel + " is moving at now.");
    }

    public void beep() {
        System.out.println("<<Beep beep>>");
    }
}
