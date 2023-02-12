package TaskForSynchronized;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dispatcher {
    public static void main(String[] args) throws InterruptedException {
        // for collectivity calculating, it's collective object for 3 threads
        Summator summator = new Summator();
        // 30 + 1.8 = 31.8
        Counter firstCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForSynchronized/FirstFile"), summator);
        // 99 + 87 + 9.5 = 195.5
        Counter secondCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForSynchronized/SecondFile"), summator);
        // 4308 + 8 + 666 + 777 = 5759
        Counter thirdCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForSynchronized/ThirdFile"), summator);

        new Thread(firstCounter).start();
        new Thread(secondCounter).start();
        new Thread(thirdCounter).start();

        try(ExecutorService executorService = Executors.newCachedThreadPool()) {
            List<Callable<Counter>> callablesCounters = new ArrayList<>(List.of(
                    firstCounter, secondCounter, thirdCounter
            ));

            executorService.invokeAll(callablesCounters);
            executorService.shutdown();
        }

        // 31.8 + 195.5 + 5759 = 5986.3
        System.out.println(summator);
        System.out.println("Is equals? " +
                summator.isEqualsSums());
    }
}
