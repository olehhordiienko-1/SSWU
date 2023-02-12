package TaskForVehiclesInheritance.PartsOfVehicles;

public class FuelTank {
    private double fuelCapacity;
    private String model;

    public FuelTank(double fuelCapacity, String model) {
        this.fuelCapacity = fuelCapacity;
        this.model = model;
    }

    public FuelTank(){}

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "FuelTank" +
                "fuelCapacity=" + fuelCapacity +
                ", model='" + model;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((FuelTank)obj).model) &&
                this.fuelCapacity == ((FuelTank)obj).fuelCapacity;
    }
}