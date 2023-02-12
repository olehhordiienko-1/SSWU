import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Handler {
    public static void main(String[] args) {
        Ticket[] tickets = {new Ticket(10), new Ticket(11), new Ticket(12)};
        Cashier c1 = new Cashier(1, tickets);
        Cashier c2 = new Cashier(2, tickets);
        Cashier c3 = new Cashier(3, tickets);
        c1.start();
        c2.start();
        c3.start();
    }
}

class Ticket {
    int place;
    boolean isBought = false;
    Lock lock = new ReentrantLock();

    Ticket(int place) {
        this.place = place;
    }

    public void buy(int id) {
//        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            if (!isBought) {
                try {
                    Thread.sleep(10);
                } catch (Exception exception) {

                }
                this.isBought = true;
                System.out.println("Cashier " + id + " is bought ticket " + this.place);
            }
        } finally {
            lock.unlock();
        }
    }
}

class Cashier extends Thread {
    int id;
    Ticket[] tickets;

    Cashier(int id, Ticket[] tickets) {
        this.id = id;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        for (Ticket temp : tickets) {
            temp.buy(this.id);
        }
    }
}