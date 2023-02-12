package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.MainClasses.Ship;
import TaskForVehiclesInheritance.PartsOfVehicles.Anchor;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;

public class Tugboat extends Ship {
    private double lengthCable;
    private boolean hasBathyscaphe;

    public Tugboat(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Anchor anchor, int countCabins, double lengthCable, boolean hasBathyscaphe) {
        super(model, owner, speed, fuel, mileage, engine, anchor, countCabins);
        this.lengthCable = lengthCable;
        this.hasBathyscaphe = hasBathyscaphe;
    }

    public Tugboat(){}

    public double getLengthCable() {
        return lengthCable;
    }

    public void setLengthCable(double lengthCable) {
        this.lengthCable = lengthCable;
    }

    public boolean isHasBathyscaphe() {
        return hasBathyscaphe;
    }

    public void setHasBathyscaphe(boolean hasBathyscaphe) {
        this.hasBathyscaphe = hasBathyscaphe;
    }

    @Override
    public String toString() {
        return "Tugboat" +
                "lengthCable=" + lengthCable +
                ", hasBathyscaphe=" + hasBathyscaphe +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.lengthCable == ((Tugboat) obj).lengthCable &&
                this.hasBathyscaphe == ((Tugboat) obj).hasBathyscaphe;
    }
}