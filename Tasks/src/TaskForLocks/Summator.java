package TaskForLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Summator {
    private double sumLocked = 0;
    private final Lock lock = new ReentrantLock();

    public Summator() {}

    public double getSumLocked() {
        return this.sumLocked;
    }


    public void setSumLocked(double sumLocked) {
        this.sumLocked = sumLocked;
    }

    public Lock getLock() {
        return lock;
    }


    public void addValueToSum(double addingValue) {
//        lock.lock();
        try {
            while (!lock.tryLock()) {
                System.out.println(Thread.currentThread().getName() + " LOCKED");
            }

            this.sumLocked += addingValue;
        } finally {
            lock.unlock();
        }
    }


    @Override
    public String toString() {
        return "\nSum with Locks = " + this.sumLocked;
    }

}
