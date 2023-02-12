//package Sigma.Software.Synchronized1;
//
//public class Handler {
//    public static void main(String[] args) {
//        Ticket[] t = {new Ticket(10), new Ticket(11), new Ticket(12)};
//        Cashier c1 = new Cashier(1, t);
//        Cashier c2 = new Cashier(2, t);
//        Cashier c3 = new Cashier(3, t);
//
//        c1.start();
//        c2.start();
//        c3.start();
//    }
//}
//
//class Ticket {
//    int place;
//    boolean isBought = false;
//
//    public Ticket(int place) {
//        this.place = place;
//    }
//}
//
//class Cashier extends Thread {
//    int id;
//    Ticket[] tickets;
//
//    Cashier(int id, Ticket[] tickets) {
//        this.id = id;
//        this.tickets = tickets;
//    }
//
//    @Override
//    public void run() {
//        buy();
//    }
//
//    public synchronized void buy() {
//        for (Ticket ticket : tickets) {
//            if (!ticket.isBought) {  // atomic
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                }
//                ticket.isBought = true;
//                System.out.println("Cashier " + this.id +
//                        " was bought ticket " + ticket.place);
//            }
//        }
//    }
//}
