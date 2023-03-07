package TaskForWaitNotify.Main;

import java.util.List;

public class CounterWhitespaces implements Runnable {
    private List<FileWrapper> files;

    public CounterWhitespaces() {

    }

    public CounterWhitespaces(List<FileWrapper> files) {
        this.files = files;
        new Thread(this, "counter").start();
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
            file.calculateWhitespaces();
        }
    }
}
