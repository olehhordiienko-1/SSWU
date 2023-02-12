package somePack;

public class TaskForThreads {
    public static void main(String[] args) {
        Runnable testRunnable = () -> {
            for (; Controller.count < 100; Controller.count++) {
                System.out.println(">> = " + Controller.count);
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable test_2_Runnable = () -> {
            for (; Controller.count > 0; Controller.count--) {
                System.out.println("<< = " + Controller.count);
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread threadTest3 = new Thread(test_2_Runnable);
        Thread threadTest2 = new Thread(testRunnable);

        threadTest2.start();
        threadTest3.start();
    }

}

class Controller{
    static int count = 50;
}
