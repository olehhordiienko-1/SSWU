package TaskForVehiclesInheritance.PartsOfVehicles;

public class Bomb {
    private double mass;
    private double caliber;
    private double TNT_equivalent;
    private String model;

    public Bomb(double mass, double caliber, double TNT_equivalent, String model) {
        this.mass = mass;
        this.caliber = caliber;
        this.TNT_equivalent = TNT_equivalent;
        this.model = model;
    }

    public Bomb(){}

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public double getTNT_equivalent() {
        return TNT_equivalent;
    }

    public void setTNT_equivalent(double TNT_equivalent) {
        this.TNT_equivalent = TNT_equivalent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bomb" +
                "mass=" + mass +
                ", caliber=" + caliber +
                ", TNT_equivalent=" + TNT_equivalent +
                ", model='" + model;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Bomb)obj).model) &&
                this.TNT_equivalent == ((Bomb)obj).TNT_equivalent &&
                this.caliber == ((Bomb)obj).caliber &&
                this.mass == ((Bomb)obj).mass;
    }
}
