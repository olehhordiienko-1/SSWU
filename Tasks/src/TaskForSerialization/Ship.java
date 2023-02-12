package TaskForSerialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ship extends Vehicle implements Externalizable {
    private double displacement;
    private double length;
    private transient Boat boat;

    public Ship() {
    }

    public Ship(int speed, int manufactureYear, Engine engine, double displacement, double length, Boat boat) {
        super(speed, manufactureYear, engine);
        this.displacement = displacement;
        this.length = length;
        this.boat = boat;
    }

    public double getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Boat getBoat() {
        return this.boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.boat + " " +
                this.length + " " + this.displacement;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.boat.equals(((Ship) obj).boat) &&
                ((Double.compare(this.displacement, ((Ship) obj).displacement)) == 0) &&
                ((Double.compare(this.length, ((Ship) obj).length)) == 0);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(super.getSpeed());
        out.writeInt(super.getManufactureYear());
        out.writeObject(super.getEngine().getType());
        out.writeDouble(super.getEngine().getPower());
        out.writeDouble(this.length);
        out.writeDouble(this.displacement);
        out.writeInt(this.boat.getCountPassengers());
        out.writeObject(this.boat.getMaterial());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.setSpeed(in.readInt());
        super.setManufactureYear(in.readInt());
        super.setEngine(new Engine((String)in.readObject(), in.readDouble()));
        this.length = in.readDouble();
        this.displacement = in.readDouble();
        this.boat = new Boat(in.readInt(), (String)in.readObject());
    }
}
