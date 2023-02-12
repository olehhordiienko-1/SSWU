package TaskForThreads;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Counter implements Callable<Counter>, Comparable<Counter> {
    private File file;
    private int countPunctual;

    public Counter(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getCountPunctual() {
        return this.countPunctual;
    }

    public void setCountPunctual(int countPunctual) {
        this.countPunctual = countPunctual;
    }

    @Override
    public String toString() {
        return this.file.getName() + " " + this.countPunctual;
    }

    @Override
    public boolean equals(Object obj) {
        return this.file.equals(((Counter) obj).file) &&
                this.countPunctual == ((Counter) obj).countPunctual;
    }

    @Override
    public int hashCode(){
        return this.countPunctual * 19 + this.file.getName().length() * 13;
    }

    @Override
    public Counter call() {
        try (Scanner scanner = new Scanner(this.file)){
            while (scanner.hasNext()) {
                if (scanner.hasNext("\\S*\\p{Punct}\\S*")) {
                    this.countPunctual++;
                } else if (scanner.hasNext("\\S*\\p{Punct}\\S*\\p{Punct}")) {
                    // this case for slang words as shorting years old as y.o. or double delimiters as ?!
                    this.countPunctual += 2;
                }
                scanner.next();
            }
        } catch (IOException e) {
            System.out.println("IOException in method call() - class Counter.");
        }

        return this;
    }

    // for ascending sorting
    @Override
    public int compareTo(Counter counter) {
        return counter.countPunctual - this.countPunctual;
    }
}
