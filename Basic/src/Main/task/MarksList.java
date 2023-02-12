package Main.task;

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
}
