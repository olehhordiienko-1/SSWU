package TaskForLines;

import java.io.*;

public class Line implements Serializable {
    private int k;
    private int b;

    public Line() {
    }

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return this.k + " " + this.b;
    }

    @Override
    public boolean equals(Object obj) {
        return this.k == ((Line) obj).k &&
                this.b == ((Line) obj).b;
    }

    @Override
    public int hashCode() {
        return 19 * this.k + 17 * this.b;
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}
