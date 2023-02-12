package RectanglesMVC;

import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) {
        ArrayList<Rectangle> array = new ArrayList<>();
        array.add(new Rectangle(3, 3, 6, 6));
        array.add(new Rectangle(7,3,12,6));
        array.add(new Rectangle(1,1,3,3));
        array.add(new Rectangle(4,4,9,9));
        array.add(new Rectangle(5,5,6,6));
        array.add(new Rectangle(12,3,19,6));
        ControllerAndView.determineIntersectionBetweenRectangles(array.get(0), array.get(1));
        ControllerAndView.determineIntersectionBetweenRectangles(array);
    }
}
