package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Car;
import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Extinguisher;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;

public class Bus extends Car {
    private Extinguisher extinguisher;
    private String typeOfBus;
    private String schedule;
    private double toll;

    public Bus(String model, Owner owner, double speed, double fuel, double mileage, boolean hasFirstAidKit, String color, Engine engine, Wheel[] wheels, Extinguisher extinguisher, String typeOfBus, String schedule, double toll) {
        super(model, owner, speed, fuel, mileage, hasFirstAidKit, color, engine, wheels);
        this.extinguisher = extinguisher;
        this.typeOfBus = typeOfBus;
        this.schedule = schedule;
        this.toll = toll;
    }

    public Bus(){}

    public Extinguisher getExtinguisher() {
        return extinguisher;
    }

    public void setExtinguisher(Extinguisher extinguisher) {
        this.extinguisher = extinguisher;
    }

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getToll() {
        return toll;
    }

    public void setToll(double toll) {
        this.toll = toll;
    }

    @Override
    public String toString() {
        return "Bus" +
                "extinguisher=" + extinguisher +
                ", typeOfBus='" + typeOfBus + '\'' +
                ", schedule='" + schedule + '\'' +
                ", toll=" + toll +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.extinguisher.equals(((Bus) obj).extinguisher) &&
                this.typeOfBus.equals(((Bus) obj).typeOfBus) &&
                this.schedule.equals(((Bus) obj).schedule);
    }
}
