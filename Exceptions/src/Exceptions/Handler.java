package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Handler {
    public static void main(String[] args) throws IOException {
        m1();
    }

    static void m1() throws IOException{
        m2();
    }
    static void m2() throws IOException {
        File f1 = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/" +
                "Projects/src/Sigma/Software/Exceptions/file1");
        f1.createNewFile();
    }
}

class Parent {
    void m1() throws FileNotFoundException {}
    void m2() throws IOException {}
}

class Child extends Parent {
    void m1()  {}
    void m2() throws FileNotFoundException {}
}