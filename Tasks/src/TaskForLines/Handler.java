//package Sigma.Software.TaskForLines;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class Handler {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ArrayList<Point> alp = new ArrayList<>(List.of(
//                new Point(1, 6), new Point(6, 1), new Point(4, 3),
//                new Point(5, 4), new Point(10, 9)
//        ));
//
//        ArrayList<Line> all = new ArrayList<>(List.of(
//                new Line(0, 6), new Line(5, 1), new Line(7, -1)
//        ));
//
//        File serial = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/Projects/src/Sigma/Software/TaskForLines/LINES.ser");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serial));
//        HashMap<Line, Integer> hmli = Controller.defineHowMuchPointsLiesOnLine(all, alp);
//        oos.writeObject(hmli);
//        HashMap<Point, Integer> hmpi = Controller.defineCountLinesAreViaSpecifiedPoints(alp);
//        oos.writeObject(hmpi);
//        oos.flush();
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serial));
//        HashMap<Line, Integer> lineMap = (HashMap<Line, Integer>)ois.readObject();
//        HashMap<Point, Integer> pointMap = (HashMap<Point, Integer>)ois.readObject();
//        System.out.println(lineMap);
//        System.out.println(pointMap);
//        ois.close();
//    }
//}
