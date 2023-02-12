package TaskForLocks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Counter implements Runnable {
    private File file;
    private Summator summator;

    public Counter(File file, Summator summator) {
        this.file = file;
        this.summator = summator;
    }

    public Counter() {
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Summator getSum() {
        return this.summator;
    }

    public void setSum(Summator summator) {
        this.summator = summator;
    }

    @Override
    public String toString() {
        return this.file.getName() + this.summator;
    }

    @Override
    public boolean equals(Object obj) {
        return this.file.equals(((Counter) obj).file);
    }

    @Override
    public int hashCode() {
        return this.file.getName().length() * 13 + this.file.getPath().length();
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNext("\\d+(?:\\.\\d+)?")) {
                    this.summator.addValueToSum(Double.parseDouble(scanner.next()));
                } else {
                    scanner.next();
                }
            }
        } catch (IOException e) {
            System.out.println("IOException in method run() - class Counter.");
        }
    }
}
