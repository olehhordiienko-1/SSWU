package TaskForLines;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Point> pointsList = new ArrayList<>(List.of(
                new Point(1, 6), new Point(6, 1), new Point(4, 3),
                new Point(5, 4), new Point(10, 9)
        ));

        ArrayList<Line> linesList = new ArrayList<>(List.of(
                new Line(0, 6), new Line(5, 1), new Line(7, -1)
        ));

        File file = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                "SigmaSoftware/Projects/src/Sigma/Software/TaskForLines/LINES.ser");
        HashMap<Point, Integer> points = Controller.defineCountLinesAreViaSpecifiedPoints(pointsList);
        HashMap<Line, Integer> lines = Controller.defineHowMuchPointsLiesOnLine(linesList, pointsList);
        Controller.serializeHashMapsForLinesAndPoints(file, points, lines);
        Controller.deserializeHashMapsForLinesAndPoints(file);
    }
}
