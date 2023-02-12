package MVC.TrianglesMVC;

public class Dispatcher {
    public static void main(String[] args) {
        DownTriangle downTriangle = new DownTriangle(5, 1, '.');
        ControllerAndView.print(downTriangle);

        UpTriangle upTriangle = new UpTriangle(7, 4, '*');
        ControllerAndView.print(upTriangle);

        MirroredDownTriangle mirroredDownTriangle = new MirroredDownTriangle(6, 0, '#');
        ControllerAndView.print(mirroredDownTriangle);

        MirroredUpTriangle mirroredUpTriangle = new MirroredUpTriangle(10, 15, '"');
        ControllerAndView.print(mirroredUpTriangle);

        Rectangle rectangle = new Rectangle(10, 0, '&');
        ControllerAndView.print(rectangle);

        Trapeze trapeze = new Trapeze(6, 1, '>', true);
        ControllerAndView.print(trapeze);

        SimpleParallelogram simpleParallelogram = new SimpleParallelogram(5, 0, '.', true);
        ControllerAndView.print(simpleParallelogram);

        MirroredParallelogram mirroredParallelogram = new MirroredParallelogram(5, 2, '.', true);
        ControllerAndView.print(mirroredParallelogram);

        VerticalTriangle verticalTriangle = new VerticalTriangle(6, 4, '*', true);
        ControllerAndView.print(verticalTriangle);

        MirroredVerticalTriangle mirroredVerticalTriangle = new MirroredVerticalTriangle(7, 1, '.', true);
        ControllerAndView.print(mirroredVerticalTriangle);

        ChristmasTree christmasTree = new ChristmasTree(12, 0, '.');
        ControllerAndView.print(christmasTree);

        Rocket rocket = new Rocket(5, 0, '$');
        ControllerAndView.print(rocket);
    }
}
