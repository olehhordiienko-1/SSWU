package Exceptions;

import java.io.File;
import java.io.IOException;

public class Handler3 {
    public static void main(String[] args) {
        try {
            m();
        } catch (Exception e) {
            System.out.println("Final Handling");
        }
    }

    static void m() {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println("Preliminary handling");
            throw e;
        }
    }

}
