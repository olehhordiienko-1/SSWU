package TaskForLines;

import java.io.*;

public class Point implements Comparable<Point>, Serializable {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

    @Override
    public boolean equals(Object obj) {
        return this.x == ((Point) obj).x &&
                this.y == ((Point) obj).y;
    }

    @Override
    public int hashCode() {
        return 17 * this.x + 19 * this.y;
    }

    @Override
    public int compareTo(Point point) {
        return this.x - point.x;
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