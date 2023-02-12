package ThreadsTest44;

public class Cruiser {
    private int a = 0;
    public void foo() {
        Runnable r = new LittleCruiser();
        new Thread(r).start();
        new Thread(r).start();
    }

    public static void main(String[] args) {
        Cruiser cruiser = new Cruiser();

        cruiser.foo();
    }

    public class LittleCruiser implements Runnable {

        @Override
        public void run() {
            int current = 0;
            for(int i = 0; i < 4; i++) {
                current = a;
                System.out.println(Thread.currentThread().getName() + " current " + current);
                a = current + 2;
            }
        }

        public void incr() {
            a++;
        }
    }
}
