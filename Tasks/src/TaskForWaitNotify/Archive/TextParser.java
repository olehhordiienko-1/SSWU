//package TaskForWaitNotify.Archive;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class TextParser {
//    private List<FileWrapper> files;
//
//    public TextParser() {
//    }
//
//    public TextParser(List<FileWrapper> files) {
//        this.files = files;
//    }
//
//    public List<FileWrapper> getFiles() {
//        return this.files;
//    }
//
//    public void setFiles(List<FileWrapper> files) {
//        this.files = files;
//    }
//
//    public synchronized void readFiles() {
//        for (FileWrapper file : files) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file.getFile()))) {
//                int character;
//                int counter = 0;
//                while ((character = reader.read()) != -1) {
//                    if ((char) character == ' ') {
//                        counter++;
//                    }
//                }
//                System.out.println("debug setter");
//                file.setCountWhitespaces(counter);
//                System.out.println("debug under setter");
//                // notify!
////                notify();
//            } catch (IOException e) {
//                System.out.println("IOException was intercepted");
//            }
//            System.out.println(1);
//        }
//    }
//
//    public synchronized void changeLetters() throws InterruptedException {
//        ArrayList<String> words;
//
//        for (FileWrapper file : files) {
//            words = new ArrayList<>();
//
//            Thread.sleep(2000);
//            System.out.println("debug scanner");
//            try (Scanner scanner = new Scanner(file.getFile())) {
//                System.out.println("debug under scanner");
//                String word;
//                if (file.getCountWhitespaces() % 2 == 0) {
//                    while (scanner.hasNext()) {
//                        word = scanner.next();
//                        words.add(word.length() > 1 ? word.substring(0, 1).toUpperCase()
//                                + word.substring(1)
//                                : word.toUpperCase());
//                    }
//                } else {
//                    while (scanner.hasNext()) {
//                        word = scanner.next();
//                        words.add(word.length() > 1 ? word.substring(0, word.length() - 1)
//                                + word.substring(word.length() - 1).toUpperCase()
//                                : word.toUpperCase());
//                    }
//                }
//            } catch (FileNotFoundException e) {
//                System.out.println("FileNotFoundException was intercepted.");
//            }
//
//            try (PrintWriter printWriter = new PrintWriter(new FileWriter(file.getFile()))) {
//                int size = words.size();
//                for (int index = 0; index < size - 1; index++) {
//                    printWriter.print(words.get(index) + " ");
//                }
//                printWriter.print(words.get(size - 1));
//            } catch (IOException e) {
//                System.out.println("IOException was intercepted");
//            }
//            System.out.println(2);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "TextParser{"
//                + this.files +
//                '}';
//    }
//}
