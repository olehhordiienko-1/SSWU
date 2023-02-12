package Serialization;

import java.io.*;

public class Handler {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f1 = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                "SigmaSoftware/Projects/src/Sigma/Software/Serialization/file2");
        Car c1 = new Car("BMW", 7000, new Engine("Mann", 250), 200);
        c1.field = 200;
        c1.fieldCopy = c1.field;
        c1.staticFieldCopy = Car.staticField;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
        oos.writeObject(c1);
        oos.flush(); oos.close();

        Car.staticField = 400;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
        Car c2 = (Car)ois.readObject();
        c2.field = c2.fieldCopy;
        System.out.println(c2);
        ois.close();
        System.out.println(c2.staticFieldCopy);
    }
}

class Parent {
    int field;

    Parent(int field) {
        this.field = field;
    }

    Parent() {}
}
class Car extends Parent implements Serializable {
    transient Engine engine;
    String model;
    int price;
    int fieldCopy;
    static int staticField = 300;
    int staticFieldCopy;

    public Car(String model, int price, Engine engine, int field) {
        super(field);
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return this.model + " " + this.price + " " + this.engine
                + " " + super.field;
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(engine.producer);
            os.writeInt(engine.power);
        } catch (IOException e) {
            System.out.println("Exception in writing default");
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            String s = (String)is.readObject();
            int i = is.readInt();
            this.engine = new Engine(s, i);
        } catch (Exception e) {
            System.out.println("Exception in writing default");
        }
    }
}

class Engine implements Serializable {
    String producer;
    int power;

    public Engine(String producer, int power) {
        this.producer = producer;
        this.power = power;
    }

    public String toString() {
        return this.producer + " " + this.power;
    }
}