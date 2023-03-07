public class PC {
    public static void main(String[] args) {
        Product product = new Product();
        new Producer(product);
        new Consumer(product);
    }
}

class Product {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException е) {
                System.out.println("Иcключeниe типа"
                        + "InterruptedException перехвачено");
            }
        System.out.println("Пoлyчeнo: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                System.out.println();
            }
        }

        this.n = n;
        valueSet = true;
        notify();
        System.out.println("Oтпpaвлeнo: " + n);
    }
}

class Producer implements Runnable{
    Product product;

    public Producer(Product product) {
        this.product = product;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            product.put(++i);
        }
    }
}

class Consumer implements Runnable {
    Product product;

    public Consumer (Product product) {
        this.product = product;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            product.get();
            i++;
        }
    }
}

