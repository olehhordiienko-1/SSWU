package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.MainClasses.Plane;
import TaskForVehiclesInheritance.PartsOfVehicles.*;

import java.util.Arrays;

public class PassengerPlane extends Plane {
    private Extinguisher extinguisher;
    private int countSeats;
    private Stewardess[] stewardesses;

    public PassengerPlane(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Wing[] wings, Wheel[] chassis, Extinguisher extinguisher, int countSeats, Stewardess[] stewardesses) {
        super(model, owner, speed, fuel, mileage, engine, wings, chassis);
        this.extinguisher = extinguisher;
        this.countSeats = countSeats;
        this.stewardesses = stewardesses;
    }

    public PassengerPlane(){}

    public Extinguisher getExtinguisher() {
        return extinguisher;
    }

    public void setExtinguisher(Extinguisher extinguisher) {
        this.extinguisher = extinguisher;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public Stewardess[] getStewardesses() {
        return stewardesses;
    }

    public void setStewardesses(Stewardess[] stewardesses) {
        this.stewardesses = stewardesses;
    }

    @Override
    public String toString() {
        return "PassengerPlane" +
                "extinguisher=" + extinguisher +
                ", countSeats=" + countSeats +
                ", stewardesses=" + Arrays.toString(stewardesses) +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.extinguisher.equals(((PassengerPlane) obj).extinguisher) &&
                Arrays.equals(this.stewardesses, ((PassengerPlane) obj).stewardesses) &&
                this.countSeats == ((PassengerPlane) obj).countSeats;
    }
}
