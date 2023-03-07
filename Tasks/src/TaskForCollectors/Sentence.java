package TaskForCollectors;

public class Sentence {
    private int difference;
    private int position;

    public Sentence(int difference, int position) {
        this.difference = difference;
        this.position = position;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "difference=" + difference +
                ", position=" + position +
                '}';
    }
}
