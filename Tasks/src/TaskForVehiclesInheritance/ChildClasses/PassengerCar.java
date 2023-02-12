package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Car;
import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;

public class PassengerCar extends Car {
    private String typeOfCar;
    private double volumeTrunk;
    private double volumeGas;

    public PassengerCar(String model, Owner owner, double speed, double fuel, double mileage, boolean hasFirstAidKit, String color, Engine engine, Wheel[] wheels, String typeOfCar, double volumeTrunk, double volumeGas) {
        super(model, owner, speed, fuel, mileage, hasFirstAidKit, color, engine, wheels);
        this.typeOfCar = typeOfCar;
        this.volumeTrunk = volumeTrunk;
        this.volumeGas = volumeGas;
    }

    public PassengerCar(){}

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public double getVolumeTrunk() {
        return volumeTrunk;
    }

    public void setVolumeTrunk(double volumeTrunk) {
        this.volumeTrunk = volumeTrunk;
    }

    public double getVolumeGas() {
        return volumeGas;
    }

    public void setVolumeGas(double volumeGas) {
        this.volumeGas = volumeGas;
    }

    @Override
    public String toString() {
        return "PassengerCar" +
                "typeOfCar='" + typeOfCar + '\'' +
                ", volumeTrunk=" + volumeTrunk +
                ", volumeGas=" + volumeGas +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.typeOfCar.equals(((PassengerCar) obj).typeOfCar) &&
                this.volumeGas == ((PassengerCar) obj).volumeGas;
    }
}
