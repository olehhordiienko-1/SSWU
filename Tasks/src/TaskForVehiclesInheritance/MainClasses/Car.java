package TaskForVehiclesInheritance.MainClasses;

import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;

import java.util.Arrays;

public class Car extends Vehicle {
    private boolean hasFirstAidKit;
    private String color;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String model, Owner owner, double speed, double fuel, double mileage, boolean hasFirstAidKit, String color, Engine engine, Wheel[] wheels) {
        super(model, owner, speed, fuel, mileage);
        this.hasFirstAidKit = hasFirstAidKit;
        this.color = color;
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car() {
    }

    public boolean isHasFirstAidKit() {
        return hasFirstAidKit;
    }

    public void setHasFirstAidKit(boolean hasFirstAidKit) {
        this.hasFirstAidKit = hasFirstAidKit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Handler" +
                "hasFirstAidKit=" + hasFirstAidKit +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                super.toString();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.color.equals(((Handler) obj).color) &&
//                Arrays.equals(this.wheels, ((Handler) obj).wheels) &&
//                super.equals(obj);
//    }

    // методом contains класу ArrayList;
    @Override
    public boolean equals(Object obj) {
        return this.getOwner().equals(((Car)obj).getOwner());
    }
}