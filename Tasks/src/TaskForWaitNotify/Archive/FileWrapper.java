//package TaskForWaitNotify.Archive;
//
//import java.io.File;
//
//public class FileWrapper {
//    private File file;
//    private int countWhitespaces;
//    private boolean isChanged = false;
//
//    public FileWrapper() { }
//
//    public FileWrapper(File file) {
//        this.file = file;
//    }
//
//    public synchronized File getFile() {
//        while (!isChanged) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        this.notify();
//
//        return this.file;
//    }
//
//    public void setFile(File file) {
//        this.file = file;
//    }
//
//    public synchronized int getCountWhitespaces() {
//        while (!isChanged) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        this.notify();
//        return this.countWhitespaces;
//    }
//
//    public synchronized void setCountWhitespaces(int countWhitespaces) {
//        while (isChanged) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        isChanged = true;
//        this.notify();
//        this.countWhitespaces = countWhitespaces;
//    }
//
//    @Override
//    public String toString() {
//        return "FileWrapper{" +
//                 this.file.getName() +
//                ", " + this.countWhitespaces +
//                "}";
//    }
//}
