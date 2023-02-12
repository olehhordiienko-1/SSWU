package TaskForSerialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    public static void serializePlanesList(List<Plane> list, File file) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            Collections.sort(list);
            out.writeObject(list);
        } catch (IOException ioException) {
            System.out.println("IOException in method serializePlanesList - class Controller");
        } catch (Exception exception) {
            System.out.println("Exception in method serializePlanesList - class Controller");
        }
    }

    public static void deserializePlanesList(File file) {
        ArrayList<Plane> list;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            list = (ArrayList<Plane>) in.readObject();

            System.out.println("\n-------Planes after sorting and deserialization-------");
            for (Plane plane : list) {
                System.out.println(plane);
            }
        } catch (IOException ioException) {
            System.out.println("IOException in method deserializePlanesList - class Controller");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("ClassNotFound exception in method deserializePlanesList - class Controller");
        }
    }

    public static void serializeShipsList(List<Ship> list, File file) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            Collections.sort(list);
            out.writeObject(list);
        } catch (IOException ioException) {
            System.out.println("IOException in method serializeShipsList - class Controller");
        } catch (Exception exception) {
            System.out.println("Exception in method serializeShipsList - class Controller");
        }
    }

    public static void deserializeShipsList(File file) {
        ArrayList<Ship> list;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            list = (ArrayList<Ship>) in.readObject();

            System.out.println("\n-------Ships after sorting and deserialization-------");
            for (Ship ship : list) {
                System.out.println(ship);
            }
        } catch (IOException ioException) {
            System.out.println("IOException in method deserializeShipsList - class Controller");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("ClassNotFound exception in method deserializeShipsList - class Controller");
        }
    }
}
