package RectanglesMVC;

import java.util.ArrayList;

public class ControllerAndView {
    static void determineIntersectionBetweenRectangles(Rectangle firstRectangle, Rectangle secondRectangle) {
        System.out.println("First rectangle with coordinates: ax = " + firstRectangle.ax + " ay = " + firstRectangle.ay
                + " bx = " + firstRectangle.bx + " by = " + firstRectangle.by);
        System.out.println("Second rectangle with coordinates: ax = " + secondRectangle.ax + " ay = " + secondRectangle.ay
                + " bx = " + secondRectangle.bx + " by = " + secondRectangle.by);
        if (firstRectangle.ax > secondRectangle.bx || secondRectangle.ax > firstRectangle.bx
                || secondRectangle.ay > firstRectangle.by || firstRectangle.ay > secondRectangle.by) {
            System.out.println("Rectangles do not intersect\n");
        } else if ((secondRectangle.bx == firstRectangle.ax) && (secondRectangle.ay == firstRectangle.by)
                || (secondRectangle.ax == firstRectangle.bx) && (secondRectangle.ay == firstRectangle.by)
                || (secondRectangle.ax == firstRectangle.bx) && (secondRectangle.by == firstRectangle.ay)
                || (secondRectangle.bx == firstRectangle.ax) && (secondRectangle.by == firstRectangle.ay)) {
            System.out.println("The intersection is a dot\n");
        } else if (firstRectangle.bx == secondRectangle.ax || secondRectangle.bx == firstRectangle.ax) {
            System.out.println("The intersection is a vertical line\n");
        } else if (firstRectangle.by == secondRectangle.ay || secondRectangle.by == firstRectangle.ay) {
            System.out.println("The intersection is a horizontal line\n");
        } else {
            System.out.println("The intersection is a rectangle\n");
        }
    }

    static void determineIntersectionBetweenRectangles(ArrayList<Rectangle> arrayList) {
        for (int firstElement = 0; firstElement < arrayList.size(); firstElement++) {
            // first element + 1
            for (int secondElement = 0; secondElement < arrayList.size(); secondElement++) {
                if (firstElement != secondElement) {
                    determineIntersectionBetweenRectangles(arrayList.get(firstElement), arrayList.get(secondElement));
                }
            }
        }
    }
}
