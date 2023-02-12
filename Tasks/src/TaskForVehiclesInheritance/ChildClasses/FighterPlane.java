package TaskForVehiclesInheritance.ChildClasses;

import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.MainClasses.Plane;
import TaskForVehiclesInheritance.PartsOfVehicles.*;

import java.util.Arrays;

public class FighterPlane extends Plane {
    private boolean hasSupersonicSpeed;
    private Apron[] aprons;
    private Bomb[] bombs;
    private Gun[] guns;
    private FuelTank[] fuelTanks;

    public FighterPlane(String model, Owner owner, double speed, double fuel, double mileage, Engine engine, Wing[] wings, Wheel[] chassis, boolean hasSupersonicSpeed, Apron[] aprons, Bomb[] bombs, Gun[] guns, FuelTank[] fuelTanks) {
        super(model, owner, speed, fuel, mileage, engine, wings, chassis);
        this.hasSupersonicSpeed = hasSupersonicSpeed;
        this.aprons = aprons;
        this.bombs = bombs;
        this.guns = guns;
        this.fuelTanks = fuelTanks;
    }

    public FighterPlane(){}

    public Apron[] getAprons() {
        return aprons;
    }

    void setAprons(Apron[] aprons) {
        this.aprons = aprons;
    }

    public Bomb[] getBombs() {
        return bombs;
    }

    void setBombs(Bomb[] bombs) {
        this.bombs = bombs;
    }

    public Gun[] getGuns() {
        return guns;
    }

    void setGuns(Gun[] guns) {
        this.guns = guns;
    }

    public FuelTank[] getFuelTanks() {
        return fuelTanks;
    }

    void setFuelTanks(FuelTank[] fuelTanks) {
        this.fuelTanks = fuelTanks;
    }

    void setHasSupersonicSpeed(boolean hasSupersonicSpeed) {
        this.hasSupersonicSpeed = hasSupersonicSpeed;
    }

    public boolean isHasSupersonicSpeed() {
        return hasSupersonicSpeed;
    }

    @Override
    public String toString() {
        return "FighterPlane" +
                "hasSupersonicSpeed=" + hasSupersonicSpeed +
                ", aprons=" + Arrays.toString(aprons) +
                ", bombs=" + Arrays.toString(bombs) +
                ", guns=" + Arrays.toString(guns) +
                ", fuelTanks=" + Arrays.toString(fuelTanks) +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                Arrays.equals(this.bombs, ((FighterPlane) obj).bombs) &&
                Arrays.equals(this.aprons, ((FighterPlane) obj).aprons) &&
                Arrays.equals(this.guns, ((FighterPlane) obj).guns) &&
                Arrays.equals(this.fuelTanks, ((FighterPlane) obj).fuelTanks);
    }
}
