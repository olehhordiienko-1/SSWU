package TaskForSynchronized;

import java.util.concurrent.atomic.DoubleAccumulator;

public class Summator {
    private DoubleAccumulator sumAccumulator;
    private double sumSynchronized;

    public Summator() {
        this.sumAccumulator = new DoubleAccumulator(Double::sum, 0);
        this.sumSynchronized = 0;
    }

    public double getSumSynchronized() {
        return this.sumSynchronized;
    }

    public double getSumAccumulator() {
        return this.sumAccumulator.get();
    }

    public void setSumAccumulator(DoubleAccumulator sumAccumulator) {
        this.sumAccumulator = sumAccumulator;
    }

    public synchronized void addValueToSum(double addingValue) {
        this.sumSynchronized += addingValue;
    }

    public void addValueToAccumulator(double addingValue) {
        this.sumAccumulator.accumulate(addingValue);
    }

    @Override
    public String toString() {
        return "Sum with DoubleAccumulator = " + this.sumAccumulator +
                "\nSum with Synchronized = " + this.sumSynchronized;
    }

    public boolean isEqualsSums() {
        return Double.compare
                (this.sumSynchronized, this.sumAccumulator.get()) == 0;
    }
}
