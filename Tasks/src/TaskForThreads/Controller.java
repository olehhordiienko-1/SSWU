package TaskForThreads;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static void testingOneThreadModForFindingDelimitersInText(Counter counter) {
        int countPunctual = 0;
        try(Scanner scanner = new Scanner(counter.getFile())) {
            while (scanner.hasNext()) {
                if (scanner.hasNext("\\S*\\p{Punct}\\S*")) {
                    countPunctual++;
                } else if (scanner.hasNext("\\S*\\p{Punct}\\S*\\p{Punct}")) {
                    // this case for slang words as shorting years old as y.o. or double delimiters as ?!
                    countPunctual += 2;
                }
                scanner.next();
            }
            counter.setCountPunctual(countPunctual);
        } catch (IOException e) {
            System.out.println("IOException in method" +
                    " testingOneThreadModForFindingDelimitersInText() - class Controller.");
        }
    }
}
