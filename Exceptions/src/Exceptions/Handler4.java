package Exceptions;

import java.io.File;
import java.io.IOException;

public class Handler4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/src/Sigma/Software/Exceptions/file2");
        try {
            f1.createNewFile();
            int i = 10 / 0;
//        } catch (IOException e) {
//            System.out.println("Exception");
        } finally {
            System.out.println("Fin");
        }

        new Handler4().doSome();
    }

     void doSome(){
        int y, x = 3;
        switch (x) {
            case 1: {

            }
        }
    }
}
