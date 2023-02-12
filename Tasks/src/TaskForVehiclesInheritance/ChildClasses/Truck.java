package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Car;
import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;

public class Truck extends Car {
    private double volumeTruck;
    private double loadCapacity;

    public Truck(String model, Owner owner, double speed, double fuel, double mileage, boolean hasFirstAidKit, String color, Engine engine, Wheel[] wheels, double volumeTruck, double loadCapacity) {
        super(model, owner, speed, fuel, mileage, hasFirstAidKit, color, engine, wheels);
        this.volumeTruck = volumeTruck;
        this.loadCapacity = loadCapacity;
    }

    public Truck(){}

    public double getVolumeTruck() {
        return volumeTruck;
    }

    public void setVolumeTruck(double volumeTruck) {
        this.volumeTruck = volumeTruck;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck" +
                "volumeTruck=" + volumeTruck +
                ", loadCapacity=" + loadCapacity +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.volumeTruck == ((Truck) obj).volumeTruck &&
                this.loadCapacity == ((Truck) obj).loadCapacity;
    }
}