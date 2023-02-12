package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.MainClasses.Ship;
import TaskForVehiclesInheritance.PartsOfVehicles.Anchor;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;

public class Tanker extends Ship {
    private double loadCapacity;
    private int seaworthiness;
    private boolean hasIcebreaker;

    public Tanker(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Anchor anchor, int countCabins, double loadCapacity, boolean hasIcebreaker, int seaworthiness) {
        super(model, owner, speed, fuel, mileage, engine, anchor, countCabins);
        this.loadCapacity = loadCapacity;
        this.hasIcebreaker = hasIcebreaker;
        this.seaworthiness = seaworthiness;
    }

    public Tanker(){}

    public int getSeaworthiness() {
        return seaworthiness;
    }

    public void setSeaworthiness(int seaworthiness) {
        this.seaworthiness = seaworthiness;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isHasIcebreaker() {
        return hasIcebreaker;
    }

    public void setHasIcebreaker(boolean hasIcebreaker) {
        this.hasIcebreaker = hasIcebreaker;
    }

    @Override
    public String toString() {
        return "Tanker" +
                "loadCapacity=" + loadCapacity +
                ", seaworthiness=" + seaworthiness +
                ", hasIcebreaker=" + hasIcebreaker +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.hasIcebreaker == ((Tanker) obj).hasIcebreaker &&
                this.loadCapacity == ((Tanker) obj).loadCapacity &&
                this.seaworthiness == ((Tanker) obj).seaworthiness;
    }
}
