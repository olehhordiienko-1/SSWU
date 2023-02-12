package TaskForThreads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.*;

public class Dispatcher {
    public static void main(String[] args) {
        Set<Counter> setCounters = new TreeSet<>();
        try (ExecutorService exs = Executors.newCachedThreadPool()) {
            Counter firstCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                    "SigmaSoftware/Projects/src/Sigma/Software/TaskForThreads/FirstFile"));
            Counter secondCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                    "SigmaSoftware/Projects/src/Sigma/Software/TaskForThreads/SecondFile"));
            Counter thirdCounter = new Counter(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                    "SigmaSoftware/Projects/src/Sigma/Software/TaskForThreads/ThirdFile"));
            List<Callable<Counter>> lci = new ArrayList<>();
            lci.add(firstCounter);
            lci.add(secondCounter);
            lci.add(thirdCounter);

            // for multi-threading mod
            long firstTimer = System.nanoTime();

            List<Future<Counter>> lfi = exs.invokeAll(lci);
            exs.shutdown();

            long secondTimer = System.nanoTime();

            // for one-thread mod
            Controller.testingOneThreadModForFindingDelimitersInText(firstCounter);
            Controller.testingOneThreadModForFindingDelimitersInText(thirdCounter);
            Controller.testingOneThreadModForFindingDelimitersInText(thirdCounter);

            long thirdTimer = System.nanoTime();

            for (Future<Counter> temp : lfi) {
                setCounters.add(temp.get());
            }

            System.out.println("Multithreading mod = " + (secondTimer - firstTimer));
            System.out.println("One-thread mod = " + (thirdTimer - secondTimer));

        } catch (InterruptedException interruptedException) {
            System.out.println("InterruptedException");
        } catch (ExecutionException executionException) {
            System.out.println("ExecutionException");
        }
        System.out.println(setCounters);
    }
}
