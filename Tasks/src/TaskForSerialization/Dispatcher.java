//package Sigma.Software.TaskForSerialization;
//
//import java.io.*;
//
//public class Dispatcher {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Plane plane = new Plane(350, 2011, new Engine("Plane engine", 450),
//                "Boeing", new Chassis(new Wheel(1000, 2), 6), 900);
//        File planes = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
//                "SigmaSoftware/Projects/src/Sigma/Software/TaskForSerialization/PLANES");
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(planes));
//        oos.writeObject(plane);
//        oos.flush(); oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(planes));
//        Plane oldPlane = (Plane)ois.readObject();
//        System.out.println(oldPlane);
//        ois.close();
//
//
//        Ship ship = new Ship(220, 2007, new Engine("Ship engine", 400),
//                1.5, 9.4, new Boat(14, "Metal"));
//        File ships = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
//                "SigmaSoftware/Projects/src/Sigma/Software/TaskForSerialization/SHIPS");
//        ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream(ships));
//        os2.writeObject(ship);
//        os2.flush(); os2.close();
//
//        ObjectInputStream is2 = new ObjectInputStream(new FileInputStream(ships));
//        Ship oldShip = (Ship)is2.readObject();
//        System.out.println(oldShip);
//        is2.close();
//    }
//}
