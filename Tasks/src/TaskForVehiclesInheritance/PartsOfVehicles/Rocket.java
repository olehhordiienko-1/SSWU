package TaskForVehiclesInheritance.PartsOfVehicles;

public class Rocket {
    private double power;
    private boolean selfDirection;
    private boolean hasThermalCamera;

    public Rocket(double power, boolean selfDirection, boolean hasThermalCamera) {
        this.power = power;
        this.selfDirection = selfDirection;
        this.hasThermalCamera = hasThermalCamera;
    }

    public Rocket(){}

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isSelfDirection() {
        return selfDirection;
    }

    public void setSelfDirection(boolean selfDirection) {
        this.selfDirection = selfDirection;
    }

    public boolean isHasThermalCamera() {
        return hasThermalCamera;
    }

    public void setHasThermalCamera(boolean hasThermalCamera) {
        this.hasThermalCamera = hasThermalCamera;
    }

    @Override
    public String toString() {
        return "Rocket" +
                "power=" + power +
                ", selfDirection=" + selfDirection +
                ", hasThermalCamera=" + hasThermalCamera;
    }

    @Override
    public boolean equals(Object obj) {
        return this.power == ((Rocket)obj).power &&
                this.selfDirection == ((Rocket)obj).selfDirection &&
                this.hasThermalCamera == ((Rocket)obj).hasThermalCamera;

    }
}