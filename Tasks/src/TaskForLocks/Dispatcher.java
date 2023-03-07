package TaskForLocks;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Dispatcher {
    public static void main(String[] args) throws InterruptedException {
        // for collectivity calculating, it's collective object for 3 threads
        Summator summator = new Summator();
        // 30 + 1.8 = 31.8
        Counter firstCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForLocks/FirstFile"), summator);
        // 99 + 87 + 9.5 = 195.5
        Counter secondCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForLocks/SecondFile"), summator);
        // 4308 + 8 + 666 + 777 = 5759
        Counter thirdCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForLocks/ThirdFile"), summator);

        Thread firstThread = new Thread(firstCounter, "1-thread");
        Thread secondThread = new Thread(secondCounter, "2-thread");
        Thread thirdThread = new Thread(thirdCounter, "3-thread");

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();


        // 31.8 + 195.5 + 5759 = 5986.3
        System.out.println(summator);
    }
}
