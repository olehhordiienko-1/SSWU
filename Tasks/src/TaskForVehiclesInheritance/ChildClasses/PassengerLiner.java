package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.MainClasses.Ship;
import TaskForVehiclesInheritance.PartsOfVehicles.Anchor;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;

public class PassengerLiner extends Ship {
    private boolean hasPool;
    private boolean hasParkingForCargo;
    private boolean hasRestaurant;

    public PassengerLiner(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Anchor anchor, int countCabins, boolean hasPool, boolean hasParkingForCargo, boolean hasRestaurant) {
        super(model, owner, speed, fuel, mileage, engine, anchor, countCabins);
        this.hasPool = hasPool;
        this.hasParkingForCargo = hasParkingForCargo;
        this.hasRestaurant = hasRestaurant;
    }

    public PassengerLiner(){}

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasParkingForCargo() {
        return hasParkingForCargo;
    }

    public void setHasParkingForCargo(boolean hasParkingForCargo) {
        this.hasParkingForCargo = hasParkingForCargo;
    }

    public boolean isHasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }

    @Override
    public String toString() {
        return "PassengerLiner" +
                "hasPool=" + hasPool +
                ", hasParkingForCargo=" + hasParkingForCargo +
                ", hasRestaurant=" + hasRestaurant +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.hasParkingForCargo == ((PassengerLiner) obj).hasParkingForCargo &&
                this.hasPool == ((PassengerLiner) obj).hasPool &&
                this.hasRestaurant == ((PassengerLiner) obj).hasRestaurant;
    }
}
