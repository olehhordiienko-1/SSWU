package TaskForVehiclesInheritance.MainClasses;

import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;
import TaskForVehiclesInheritance.PartsOfVehicles.Wing;

import java.util.Arrays;

public class Plane extends Vehicle {
    private Engine engine;
    private Wing[] wings;
    private Wheel[] chassis;

    public Plane(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Wing[] wings, Wheel[] chassis) {
        super(model, owner, speed, fuel, mileage);
        this.engine = engine;
        this.wings = wings;
        this.chassis = chassis;
    }

    public Plane(){}

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wing[] getWings() {
        return wings;
    }

    public void setWings(Wing[] wings) {
        this.wings = wings;
    }

    public Wheel[] getChassis() {
        return chassis;
    }

    public void setChassis(Wheel[] chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Plane" +
                "engine=" + engine +
                ", wings=" + Arrays.toString(wings) +
                ", chassis=" + Arrays.toString(chassis) +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this.engine.equals(((Plane)obj).engine) &&
                Arrays.equals(this.wings, ((Plane)obj).wings) &&
                super.equals(obj);
    }
}