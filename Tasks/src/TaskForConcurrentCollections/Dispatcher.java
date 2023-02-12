package TaskForConcurrentCollections;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;

public class Dispatcher {
    public static void main(String[] args) throws InterruptedException {
        Words words = new Words(Collections.synchronizedMap(new HashMap<>()));
        Counter firstCounter = new Counter(new File("/Users/olehhordiienko/Oleh/" +
                "JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForConcurrentCollections/FirstText"), words);
        // 99 + 87 + 9.5 = 195.5
        Counter secondCounter = new Counter(new File("/Users/olehhordiienko/Oleh/" +
                "JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForConcurrentCollections/SecondText"), words);
        // 4308 + 8 + 666 + 777 = 5759
        Counter thirdCounter = new Counter(new File("/Users/olehhordiienko/Oleh/" +
                "JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForConcurrentCollections/ThirdText"), words);

        Thread firstThread = new Thread(firstCounter);
        Thread secondThread = new Thread(secondCounter);
        Thread thirdThread = new Thread(thirdCounter);

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();

        System.out.println(words.getWords());
    }
}
