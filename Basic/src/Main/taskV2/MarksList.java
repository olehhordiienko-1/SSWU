package Main.taskV2;

import java.util.ArrayList;

public class MarksList {
    ArrayList<String> marks;
    String typeOfList;

    public MarksList() {
        typeOfList = "MARKS";

        marks = new ArrayList<>();
        marks.add("Unsatisfactory"); // 0 1 2
        marks.add("Satisfactory");   // 3
        marks.add("Good");           // 4
        marks.add("Excellent");      // 5
    }

    public void printList(String[] array) {
        for (String s : array) {
            switch (s) {
                case "0", "1", "2" -> System.out.println(marks.get(0));
                case "3" -> System.out.println(marks.get(1));
                case "4" -> System.out.println(marks.get(2));
                case "5" -> System.out.println(marks.get(3));
            }
        }
    }
}
