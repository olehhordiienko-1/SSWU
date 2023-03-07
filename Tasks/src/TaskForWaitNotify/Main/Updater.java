package TaskForWaitNotify.Main;

import java.util.List;

public class Updater implements Runnable {
    private List<FileWrapper> files;

    public Updater() {

    }

    public Updater(List<FileWrapper> files) {
        this.files = files;
        new Thread(this, "updater").start();
    }

    public List<FileWrapper> getFiles() {
        return this.files;
    }

    public void setFiles(List<FileWrapper> files) {
        this.files = files;
    }

    @Override
    public void run() {
        for (FileWrapper file : this.files) {
            try {
                file.changeLetters();
            } catch (InterruptedException interruptedException) {
                System.out.println("InterruptedException was intercepted.");
            }
        }
        System.out.println(files);
    }
}
