package MVC.Triangles2MVC;

public class Dispatcher {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 1, '.');
        ControllerAndView.printMirroredUp(triangle);

        Rectangle rectangle = new Rectangle(6, 0, '&', false);
        ControllerAndView.print(rectangle);

        Trapeze trapeze = new Trapeze(6, 0, '^', false);
        ControllerAndView.printMirroredVertical(trapeze);

        ChristmasTree christmasTree = new ChristmasTree(7, 5, '.');
        ControllerAndView.print(christmasTree);

        Rocket rocket = new Rocket(6, 0, '.');
        ControllerAndView.print(rocket);
    }
}
