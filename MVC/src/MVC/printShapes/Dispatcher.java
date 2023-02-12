package MVC.printShapes;

public class Dispatcher {
    public static void main(String[] args) {
        Model triangles = new Model(6, 0, '.');
        // level 0
//        ControllerAndView.printLineCharacters(triangles, 6);
//        ControllerAndView.printLineWhitespaces(triangles, 6);
//        System.out.println();
        // level 1
//        ControllerAndView.printUpTriangle(triangles);
//        ControllerAndView.printDownTriangle(triangles);
//        ControllerAndView.printMirroredDownTriangle(triangles);
//        ControllerAndView.printMirroredUpTriangle(triangles);
//        ControllerAndView.printRectangle(triangles);
        ControllerAndView.printHorizontalTriangle(triangles);
    }
}
