package TaskForVehiclesInheritance.PartsOfVehicles;

public class Wheel {
    private String disk;
    private double diameter;

    public Wheel(String disk, double diameter) {
        this.disk = disk;
        this.diameter = diameter;
    }

    public Wheel() {
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel" +
                "disk='" + disk + '\'' +
                ", diameter=" + diameter;
    }

    @Override
    public boolean equals(Object obj) {
        return this.disk.equals(((Wheel) obj).disk) &&
                this.diameter == ((Wheel) obj).diameter;
    }
}