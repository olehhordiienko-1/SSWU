package TaskForWaitNotify.Main;

/*
Первый поток - начинает читать файл и считать количество пробелов
Если количество парное - увеличиваем первую букву каждого слова, непарное - последнюю.
Увеличивать будет непосредственно второй поток, в то время, первый уже будет разбирать следующий файл.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        List<FileWrapper> lfw = new ArrayList<>(List.of(
                new FileWrapper(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForWaitNotify/Main/W1")),
                new FileWrapper(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForWaitNotify/Main/W2")),
                new FileWrapper(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForWaitNotify/Main/W3")),
                new FileWrapper(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForWaitNotify/Main/W4")),
                new FileWrapper(new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/Tasks/src/TaskForWaitNotify/Main/W5"))
        ));

        new Updater(lfw);
        new CounterWhitespaces(lfw);
    }
}
