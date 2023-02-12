package FindingParsingForMyRegex;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ParsingByPunctual  {
    public static void main(String[] args) {
        File file = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                "SigmaSoftware/Projects/src/Sigma/Software/FindingParsingForMyRegex/Parser"); // 4

        int counter = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if(scanner.hasNext("\\S*(\\d+(?:\\.\\d+)?)\\S*")) {
                    counter++;
                }
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            System.out.println("Exception.");
        }

        System.out.println("COUNTER : " + counter);
    }
}


// for pucnt \\S*\\p{Punct}\\S*