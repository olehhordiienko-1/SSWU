package TaskForSerialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Plane extends Vehicle implements Serializable {
    private String model;
    private transient Chassis chassis;
    private double flightRange;

    public Plane() {
    }

    public Plane(int speed, int manufactureYear, Engine engine, String model, Chassis chassis, double flightRange) {
        super(speed, manufactureYear, engine);
        this.model = model;
        this.chassis = chassis;
        this.flightRange = flightRange;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Chassis getChassis() {
        return this.chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public double getFlightRange() {
        return this.flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.model + " "
                + this.flightRange + " " + this.chassis;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.model.equals(((Plane) obj).model) &&
                this.chassis.equals(((Plane) obj).chassis) &&
                (Double.compare(this.flightRange, ((Plane) obj).flightRange) == 0);
    }

    private void writeObject(ObjectOutputStream out) {
        try {
            out.defaultWriteObject();
            // writing chassis
            out.writeDouble(this.chassis.getWheel().getDiameter());
            out.writeDouble(this.chassis.getWheel().getLoad());
            out.writeInt(this.chassis.getQuantityWheels());
            // writing engine
            out.writeObject(super.getEngine().getType());
            out.writeDouble(super.getEngine().getPower());
            // writing speed and manufacture year
            out.writeInt(super.getSpeed());
            out.writeInt(super.getManufactureYear());
        } catch (Exception e) {
            System.out.println("In method writeObject in class Plane caused exception.");
        }
//        finally {
//            System.out.println("Method writeObject ended work. Class Plane");
//        }
    }

    private void readObject(ObjectInputStream in) {
        try {
            in.defaultReadObject();
            // reading chassis
            this.chassis = new Chassis(new Wheel(in.readDouble(), in.readDouble()), in.readInt());
            // reading field from super-class
            super.setEngine(new Engine((String) in.readObject(), in.readDouble()));
            super.setSpeed(in.readInt());
            super.setManufactureYear(in.readInt());
        } catch (Exception e) {
            System.out.println("In method readObject in class Plane caused exception.");
        }
//        finally {
//            System.out.println("Method readObject ended work. Class Plane");
//        }
    }
}
