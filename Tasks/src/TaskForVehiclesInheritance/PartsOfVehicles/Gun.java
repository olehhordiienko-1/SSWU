package TaskForVehiclesInheritance.PartsOfVehicles;

public class Gun {
    private double caliber;
    private double rateOfFire;
    private double overheating;
    private String model;

    public Gun(double caliber, double rateOfFire, double overheating, String model) {
        this.caliber = caliber;
        this.rateOfFire = rateOfFire;
        this.overheating = overheating;
        this.model = model;
    }

    public Gun(){}

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public double getRateOfFire() {
        return rateOfFire;
    }

    public void setRateOfFire(double rateOfFire) {
        this.rateOfFire = rateOfFire;
    }

    public double getOverheating() {
        return overheating;
    }

    public void setOverheating(double overheating) {
        this.overheating = overheating;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Gun" +
                "caliber=" + caliber +
                ", rateOfFire=" + rateOfFire +
                ", overheating=" + overheating +
                ", model='" + model;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Gun)obj).model) &&
                this.caliber == ((Gun)obj).caliber &&
                this.rateOfFire == ((Gun)obj).rateOfFire &&
                this.overheating == ((Gun)obj).overheating;
    }
}