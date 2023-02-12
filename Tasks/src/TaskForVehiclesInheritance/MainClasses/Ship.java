package TaskForVehiclesInheritance.MainClasses;

import TaskForVehiclesInheritance.PartsOfVehicles.Anchor;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;

public class Ship extends Vehicle {
    private Engine engine;
    private Anchor anchor;
    private int countCabins;

    public Ship(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Anchor anchor, int countCabins) {
        super(model, owner, speed, fuel, mileage);
        this.engine = engine;
        this.anchor = anchor;
        this.countCabins = countCabins;
    }

    public Ship() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public int getCountCabins() {
        return countCabins;
    }

    public void setCountCabins(int countCabins) {
        this.countCabins = countCabins;
    }

    @Override
    public String toString() {
        return "Ship" +
                "engine=" + engine +
                ", anchor=" + anchor +
                ", countCabins=" + countCabins +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this.engine.equals(((Ship) obj).engine) &&
                this.anchor.equals(((Ship) obj).anchor) &&
                super.equals(obj);
    }
}