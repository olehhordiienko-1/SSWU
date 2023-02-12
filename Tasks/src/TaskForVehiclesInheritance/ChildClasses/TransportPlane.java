package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.MainClasses.Plane;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;
import TaskForVehiclesInheritance.PartsOfVehicles.Wing;

public class TransportPlane extends Plane {
    private double loadCapacity;
    private String typeOfPlane;

    public TransportPlane(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Wing[] wings, Wheel[] chassis, double loadCapacity, String typeOfPlane) {
        super(model, owner, speed, fuel, mileage, engine, wings, chassis);
        this.loadCapacity = loadCapacity;
        this.typeOfPlane = typeOfPlane;
    }

    public TransportPlane(){}

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    @Override
    public String toString() {
        return "TransportPlane" +
                "loadCapacity=" + loadCapacity +
                ", typeOfPlane='" + typeOfPlane + '\'' +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.loadCapacity == ((TransportPlane) obj).loadCapacity &&
                this.typeOfPlane.equals(((TransportPlane) obj).typeOfPlane);
    }
}