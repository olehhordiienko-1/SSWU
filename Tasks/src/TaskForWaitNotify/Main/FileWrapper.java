package TaskForWaitNotify.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileWrapper {
    private File file;
    private int countWhitespaces;

    public FileWrapper() {
    }

    public FileWrapper(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getCountWhitespaces() {
        return this.countWhitespaces;
    }

    public void setCountWhitespaces(int countWhitespaces) {
        this.countWhitespaces = countWhitespaces;
    }

    public synchronized void calculateWhitespaces() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int character;
            int counter = 0;
            while ((character = reader.read()) != -1) {
                if ((char) character == ' ') {
                    counter++;
                }
            }
            this.countWhitespaces = counter;
        } catch (IOException e) {
            System.out.println("IOException was intercepted");
        }
        this.notify();
    }

    public synchronized void changeLetters() throws InterruptedException {
        while (this.countWhitespaces == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        ArrayList<String> words = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            String word;
            int bufferLength;
            if (countWhitespaces % 2 == 0) {
                while (scanner.hasNext()) {
                    word = scanner.next();
                    bufferLength = word.length();
                    words.add(bufferLength > 1 ? word.substring(0, 1).toUpperCase()
                            + word.substring(1)
                            : word.toUpperCase());
                }
            } else {
                while (scanner.hasNext()) {
                    word = scanner.next();
                    bufferLength = word.length();
                    if (Pattern.matches("\\p{Punct}", word.substring(bufferLength - 1))) {
                        words.add(word.substring(0, bufferLength - 2)
                                + word.substring(bufferLength - 2).toUpperCase());
                    } else {
                        words.add(bufferLength > 1 ?
                                word.substring(0, bufferLength - 1)
                                        + word.substring(bufferLength - 1).toUpperCase()
                                : word.toUpperCase());
                    }

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException was intercepted.");
        }

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file))) {
            int size = words.size();
            for (int index = 0; index < size - 1; index++) {
                printWriter.print(words.get(index) + " ");
            }
            printWriter.print(words.get(size - 1));
        } catch (IOException e) {
            System.out.println("IOException was intercepted");
        }
    }

    @Override
    public String toString() {
        return "FileWrapper{" +
                this.file.getName() +
                ", " + this.countWhitespaces +
                "}";
    }
}
