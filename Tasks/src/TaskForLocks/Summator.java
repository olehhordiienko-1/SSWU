package TaskForLocks;

import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Summator {
    private double sumSynchronized = 0;
    private Lock lock = new ReentrantLock();

    public Summator(ReentrantLock reentrantLock) {
        this.lock = reentrantLock;
    }

    public double getSumSynchronized() {
        return this.sumSynchronized;
    }


    public void setSumSynchronized(double sumSynchronized) {
        this.sumSynchronized = sumSynchronized;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public void addValueToSum(double addingValue) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " LOCKED");
            this.sumSynchronized += addingValue;
        } finally {
            lock.unlock();
        }
    }


    @Override
    public String toString() {
        return "\nSum with Locks = " + this.sumSynchronized;
    }

}
