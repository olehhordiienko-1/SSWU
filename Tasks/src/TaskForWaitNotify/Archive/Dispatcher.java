//package TaskForWaitNotify.Archive;
//
///*
//Первый поток - начинает читать файл и считать количество пробелов
//Если количество парное - увеличиваем первую букву каждого слова, непарное - последнюю.
//Увеличивать будет непосредственно второй поток, в то время, первый уже будет разбирать следующий файл.
// */
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Dispatcher {
//    public static void main(String[] args) throws InterruptedException {
//        TextParser textParser = new TextParser(new ArrayList<>(
//                List.of(
//                        new FileWrapper(new File("Tasks/src/TaskForWaitNotify/W1")),
//                        new FileWrapper(new File("Tasks/src/TaskForWaitNotify/W2")),
//                        new FileWrapper(new File("Tasks/src/TaskForWaitNotify/W3")),
//                        new FileWrapper(new File("Tasks/src/TaskForWaitNotify/W4")),
//                        new FileWrapper(new File("Tasks/src/TaskForWaitNotify/W5"))
//                )
//        ));
//
//        Thread counterWhitespaces = new Thread(new CounterWhitespaces(textParser), "counterWhitespaces");
//        Thread updater = new Thread(new Updater(textParser), "updater");
//
//        counterWhitespaces.start();
//
//        updater.start();
//
//    }
//}
