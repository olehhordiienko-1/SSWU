package TaskForLines;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    public static void writeTwoMapsInTextFile(ArrayList<Point> pointsList, ArrayList<Line> linesList) {
        HashMap<Point, Integer> points = defineCountLinesAreViaSpecifiedPoints(pointsList);
        HashMap<Line, Integer> lines = defineHowMuchPointsLiesOnLine(linesList, pointsList);
        try (PrintWriter pw = new PrintWriter("/Users/olehhordiienko/Oleh/JavaCampSigma/SigmaSoftware/" +
                "Projects/src/Sigma/Software/TaskForLines/LINES")) {
            pw.println("Points");

            for (Map.Entry<Point, Integer> temp : points.entrySet()) {
                pw.println(temp.getKey() + " " + temp.getValue());
            }
            pw.println("Lines");
            for (Map.Entry<Line, Integer> temp : lines.entrySet()) {
                pw.println(temp.getKey() + " " + temp.getValue());
            }
            pw.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FileNotFoundException in class Controller - method writeTwoMapsInTextFile()!");
        }
    }

    public static void serializeHashMapsForLinesAndPoints(File file, HashMap<Point, Integer> points, HashMap<Line, Integer> lines) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(points);
            out.writeObject(lines);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FileNotFoundException in class Controller - method serializeHashMapsForLinesAndPoints()!");
        } catch (IOException ioException) {
            System.out.println("IOException in class Controller - method serializeHashMapsForLinesAndPoints()!");
        }
    }

    public static void deserializeHashMapsForLinesAndPoints(File file) {
        HashMap<Point, Integer> points;
        HashMap<Line, Integer> lines;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            points = (HashMap<Point, Integer>) ois.readObject();
            System.out.println(points);
            lines = (HashMap<Line, Integer>) ois.readObject();
            System.out.println(lines);
        } catch (FileNotFoundException | ClassNotFoundException exception) {
            System.out.println("FileNotFoundException in class Controller - method serializeHashMapsForLinesAndPoints()!");
        } catch (IOException ioException) {
            System.out.println("IOException in class Controller - method serializeHashMapsForLinesAndPoints()!");
        }
    }

    public static HashMap<Point, Integer> defineCountLinesAreViaSpecifiedPoints(ArrayList<Point> pointsList) {
        HashMap<Point, Integer> pointsMap = new HashMap<>();
        int counterLines;
        for (int index = 0; index < pointsList.size(); index++) {
            counterLines = defineHowMuchLinesCanDrawViaPoints(index, pointsList);
            pointsMap.put(pointsList.get(index), counterLines);
        }
//        System.out.println(pointsMap);
        return pointsMap;
    }

    public static int defineHowMuchLinesCanDrawViaPoints(int firstPosition, ArrayList<Point> pointsList) {
        int counterLines = 0;
        for (int secondPosition = 0; secondPosition < pointsList.size(); secondPosition++) {
            if (secondPosition == firstPosition) {
                continue;
            }
            counterLines++;
            for (int thirdPosition = secondPosition + 1; thirdPosition < pointsList.size(); thirdPosition++) {
                if (thirdPosition == firstPosition) {
                    continue;
                }
                if (definePointLiesOnLine(pointsList.get(firstPosition),
                        pointsList.get(secondPosition), pointsList.get(thirdPosition))) {
                    counterLines--;
                }
            }
        }
        return counterLines;
    }

    public static boolean definePointLiesOnLine(Point first, Point second, Point checking) {
        return (((checking.getX() - first.getX()) * (second.getY() - first.getY())) -
                ((second.getX() - first.getX()) * (checking.getY() - first.getY())) == 0);
    }

    public static HashMap<Line, Integer> defineHowMuchPointsLiesOnLine(ArrayList<Line> linesList,
                                                                       ArrayList<Point> pointsList) {
        HashMap<Line, Integer> linesMap = new HashMap<>();
        int counterPoints;
        for (Line line : linesList) {
            counterPoints = 0;
            for (Point point : pointsList) {
                if (point.getY() == ((line.getK() * point.getX()) + line.getB())) {
                    counterPoints++;
                }
            }
            linesMap.put(line, counterPoints);
        }
//        System.out.println(linesMap);
        return linesMap;
    }

}