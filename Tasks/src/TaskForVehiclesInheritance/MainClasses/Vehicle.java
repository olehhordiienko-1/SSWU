package TaskForVehiclesInheritance.MainClasses;

public class Vehicle {
    private String model;
    private Owner owner;
    private double speed;
    private double fuel; // NET
    private double mileage; // NET

    public Vehicle(String model, Owner owner, double speed, double fuel, double mileage) {
        this.model = model;
        this.owner = owner;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public Vehicle(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle" +
                "model='" + model + '\'' +
                ", owner=" + owner +
                ", speed=" + speed +
                ", fuel=" + fuel +
                ", mileage=" + mileage;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Vehicle)obj).model) &&
                this.speed == ((Vehicle)obj).speed &&
                this.owner.equals(((Vehicle)obj).owner) &&
                this.mileage == ((Vehicle)obj).mileage;
    }
}