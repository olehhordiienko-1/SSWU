//package TaskForWaitNotify.Archive;
//
//public class Updater implements Runnable {
//    private TextParser textParser;
//
//    public Updater() {
//    }
//
//    public Updater(TextParser textParser) {
//        this.textParser = textParser;
////        new Thread(this, "Updater").start();
//    }
//
//    public TextParser getTextParser() {
//        return this.textParser;
//    }
//
//    public void setTextParser(TextParser textParser) {
//        this.textParser = textParser;
//    }
//
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(2000);
//            this.textParser.changeLetters();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Updater{"
//                + this.textParser +
//                '}';
//    }
//}
