package Parsing;

import java.io.*;
import java.util.Scanner;

public class Controller {
    public static void parsingTextForSpecifiedLength() {
        File inputFile = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/src/Sigma/Software/Parsing/File1");
        File outputFile = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/src/Sigma/Software/Parsing/File2");
        try(PrintWriter printWriter = new PrintWriter(outputFile)){
            Scanner scanner = new Scanner(inputFile);
            String temp;
            while (scanner.hasNext()) {
                if(!scanner.hasNext("[^aeiouyAEIOUY].{4}")) {
                    temp = scanner.nextLine();
                    printWriter.println(temp);
                } else {
                    scanner.next();
                }
            }
        } catch (IOException e) {
            System.out.println("Exception.");
        } finally {
            System.out.println("End, the specified file closed. New file was created.");
        }
    }
}
