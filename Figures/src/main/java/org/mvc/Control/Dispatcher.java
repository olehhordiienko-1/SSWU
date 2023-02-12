package org.mvc.Control;

import org.mvc.Models.*;
import org.mvc.ChildModels.*;

public class Dispatcher {
    public static void main(String[] args) {
        DownTriangle downTriangle = new DownTriangle(5, 1, '.', "DownTriangle");
        ControllerAndView.print(downTriangle);

        UpTriangle upTriangle = new UpTriangle(7, 4, '*', "UpTriangle");
        ControllerAndView.print(upTriangle);

        MirroredDownTriangle mirroredDownTriangle = new MirroredDownTriangle(6, 0, '#', "MirroredDownTriangle");
        ControllerAndView.print(mirroredDownTriangle);

        MirroredUpTriangle mirroredUpTriangle = new MirroredUpTriangle(10, 15, '"', "MirroredUpTriangle");

        ControllerAndView.print(mirroredUpTriangle);

        Rectangle rectangle = new Rectangle(10, 0, '&', "Rectangle");
        ControllerAndView.print(rectangle);

        Trapeze trapeze = new Trapeze(6, 1, '>', "Trapeze", true);
        ControllerAndView.print(trapeze);

        SimpleParallelogram simpleParallelogram = new SimpleParallelogram(5, 0, '.', "SimpleParallelogram", true);
        ControllerAndView.print(simpleParallelogram);

        MirroredParallelogram mirroredParallelogram = new MirroredParallelogram(5, 2, '.', "MirroredParallelogram", true);
        ControllerAndView.print(mirroredParallelogram);

        VerticalTriangle verticalTriangle = new VerticalTriangle(6, 4, '*', "VerticalTriangle",true);
        ControllerAndView.print(verticalTriangle);

        MirroredVerticalTriangle mirroredVerticalTriangle = new MirroredVerticalTriangle(7, 1, '.', "MirroredVerticalTriangle", true);
        ControllerAndView.print(mirroredVerticalTriangle);

        ChristmasTree christmasTree = new ChristmasTree(12, 0, '.');
        ControllerAndView.print(christmasTree);

        Rocket rocket = new Rocket(5, 0, '$', "Rocket");
        ControllerAndView.print(rocket);
    }
}
