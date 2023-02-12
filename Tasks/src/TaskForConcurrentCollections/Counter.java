package TaskForConcurrentCollections;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Counter implements Runnable {
    private File file;
    private Words words;

    public Counter(File file, Words words) {
        this.file = file;
        this.words = words;
    }

    public Counter() {
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Words getWords() {
        return words;
    }

    public void setWords(Words words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return this.file.getName() + this.words;
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
            String temp;
            while (scanner.hasNext()) {
                temp = scanner.next();
                if (temp.length() > 1 && (temp.charAt(0) == temp.charAt(temp.length() - 1))) {
                    this.words.addWord(temp);
                }
            }
        } catch (IOException e) {
            System.out.println("IOException in method run() - class Counter.");
        }
    }
}
