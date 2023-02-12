package Threads1;

public class Handler {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = Thread.currentThread();
        // System.out.println(myThread);
        myThread.setName("FirstThread");
//        myThread.setPriority(10); // 1...10 ->
//        System.out.println(myThread.getPriority());
        // System.out.println(myThread);

        OtherThread otherThread = new OtherThread();
        otherThread.setPriority(10);
        Thread tt = new Thread(new ThirdThread());
        otherThread.start(); // otherThread.run();
        tt.start();


        for (int i = 0; i < 5; i++) {
            if (i > 1) {
                otherThread.join();
            }
            Thread.sleep(1000);
            System.out.println("i = " + i);
        }

    }
}

class ThirdThread implements Runnable {
    @Override
    public void run() {
        for (int k = 0; k < 5; k++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println("InterruptedException");
            }
            System.out.println("k = " + k);
        }
    }
}

class OtherThread extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println("InterruptedException");
            }
            System.out.println("j = " + j);
        }
    }
}