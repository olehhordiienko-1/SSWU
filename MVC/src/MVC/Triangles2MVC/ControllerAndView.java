package MVC.Triangles2MVC;

public class ControllerAndView {
    // level 0
    static void printLineCharacters(int sizeOfColumn, char character) {
        for (int column = 0; column < sizeOfColumn; column++) {
            System.out.print(character);
        }
    }

    static void printLineWhitespaces(int sizeOfColumn) {
        for (int column = 0; column < sizeOfColumn; column++) {
            System.out.print(' ');
        }
    }

    // level 1
    static void printUp(Triangle triangle) {
        for (int row = 0; row < triangle.sizeOfTriangle; row++) {
            printLineWhitespaces(triangle.rightShiftOfTriangle);
            printLineCharacters(row + 1, triangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void printDown(Triangle triangle) {
        for (int row = 0; row < triangle.sizeOfTriangle; row++) {
            printLineWhitespaces(triangle.rightShiftOfTriangle);
            printLineCharacters(triangle.sizeOfTriangle - row, triangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void printMirroredDown(Triangle triangle) {
        for (int row = 0; row < triangle.sizeOfTriangle; row++) {
            printLineWhitespaces(triangle.rightShiftOfTriangle + row);
            printLineCharacters(triangle.sizeOfTriangle - row, triangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void printMirroredUp(Triangle triangle) {
        for (int row = 0; row < triangle.sizeOfTriangle; row++) {
            printLineWhitespaces(triangle.rightShiftOfTriangle + triangle.sizeOfTriangle - row - 1);
            printLineCharacters(row + 1, triangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void print(Rectangle rectangle) {
        for (int row = 0; row < rectangle.sizeOfRectangle; row++) {
            printLineWhitespaces(rectangle.rightShiftOfRectangle);
            printLineCharacters(rectangle.sizeOfRectangle, rectangle.characterOfRectangle);
            System.out.println();
        }
    }

    static void print(Trapeze trapeze) {
        int additionForTriangle;
        int additionForTrapeze;

        if (trapeze.isSpecialCaseTriangle) {
            additionForTrapeze = 0;
            additionForTriangle = 1;
        } else {
            additionForTrapeze = 1;
            additionForTriangle = 0;
        }

        for (int row = 0; row < trapeze.sizeOfTrapeze; row++) {
            printLineWhitespaces(trapeze.rightShiftOfTrapeze + trapeze.sizeOfTrapeze - row - 1);
            printLineCharacters((row + additionForTrapeze) * 2 + additionForTriangle,
                    trapeze.characterOfTrapeze);
            System.out.println();
        }
    }

    // level 2
    static void printVertical(Trapeze trapeze) {
        Triangle upTriangle = new Triangle(trapeze.sizeOfTrapeze,
                trapeze.rightShiftOfTrapeze, trapeze.characterOfTrapeze);
        printUp(upTriangle);

        if (!trapeze.isSpecialCaseTriangle) {
            Rectangle centerRectangle = new Rectangle(trapeze.sizeOfTrapeze,
                    trapeze.rightShiftOfTrapeze, trapeze.characterOfTrapeze, false);
            print(centerRectangle);
        }

        Triangle downTriangle = new Triangle(trapeze.sizeOfTrapeze - 1,
                trapeze.rightShiftOfTrapeze, trapeze.characterOfTrapeze);
        printDown(downTriangle);
    }

    static void printVertical(Rectangle rectangle) {
        Triangle upTriangle = new Triangle(rectangle.sizeOfRectangle,
                rectangle.rightShiftOfRectangle, rectangle.characterOfRectangle);
        printUp(upTriangle);

        if (rectangle.isSpecialCaseParallelogram) {
            Rectangle centerRectangle = new Rectangle(rectangle.sizeOfRectangle,
                    rectangle.rightShiftOfRectangle, rectangle.characterOfRectangle, false);
            print(centerRectangle);
        }

        Triangle downTriangle = new Triangle(rectangle.sizeOfRectangle,
                rectangle.rightShiftOfRectangle, rectangle.characterOfRectangle);
        printMirroredDown(downTriangle);
    }

    static void printMirroredVertical(Trapeze trapeze) {
        Triangle upTriangle = new Triangle(trapeze.sizeOfTrapeze,
                trapeze.rightShiftOfTrapeze, trapeze.characterOfTrapeze);
        printMirroredUp(upTriangle);

        if (!trapeze.isSpecialCaseTriangle) {
            Rectangle centerRectangle = new Rectangle(trapeze.sizeOfTrapeze,
                    trapeze.rightShiftOfTrapeze, trapeze.characterOfTrapeze, false);
            print(centerRectangle);
        }

        Triangle downTriangle = new Triangle(trapeze.sizeOfTrapeze - 1,
                trapeze.rightShiftOfTrapeze + 1, trapeze.characterOfTrapeze);
        printMirroredDown(downTriangle);
    }

    static void printMirroredVertical(Rectangle rectangle) {
        Triangle upTriangle = new Triangle(rectangle.sizeOfRectangle,
                rectangle.rightShiftOfRectangle, rectangle.characterOfRectangle);
        printMirroredUp(upTriangle);

        if (rectangle.isSpecialCaseParallelogram) {
            Rectangle centerRectangle = new Rectangle(rectangle.sizeOfRectangle,
                    rectangle.rightShiftOfRectangle, rectangle.characterOfRectangle, false);
            print(centerRectangle);
        }

        Triangle downTriangle = new Triangle(rectangle.sizeOfRectangle,
                rectangle.rightShiftOfRectangle, rectangle.characterOfRectangle);
        printDown(downTriangle);
    }

    // level 3
    static void print(ChristmasTree christmasTree) {
        for(int elements = 0; elements < christmasTree.countOfElements; elements++) {
            for(int row = 0; row < elements + 1; row++) {
                printLineWhitespaces((christmasTree.sizeOfLastElement - row - 1) + christmasTree.rightShiftOfTree);
                printLineCharacters(row * 2 + 1, christmasTree.characterOfTree);
                System.out.println();
            }
        }
        int shiftForLastRectangle = christmasTree.sizeOfLastElement - (christmasTree.sizeOfLastElement / 4) - 1;
        Rectangle rectangle = new Rectangle(christmasTree.sizeOfLastElement / 2,
                shiftForLastRectangle + christmasTree.rightShiftOfTree,
                christmasTree.characterOfTree, false);
        print(rectangle);
    }

    static void print(Rocket rocket) {
        Trapeze headOfRocket = new Trapeze(rocket.sizeOfPartsRocket,
                rocket.rightShiftOfRocket + rocket.sizeOfPartsRocket, rocket.characterOfRocket, true);
        print(headOfRocket);

        for(int row = 0; row < rocket.sizeOfPartsRocket / 2; row++) {
            printLineWhitespaces(rocket.sizeOfPartsRocket + rocket.rightShiftOfRocket);
            printLineCharacters(rocket.sizeOfPartsRocket * 2 - 1, rocket.characterOfRocket);
            System.out.println();
        }

        for(int row = 0; row < rocket.sizeOfPartsRocket / 2; row++) {
            printLineWhitespaces(rocket.sizeOfPartsRocket - row + rocket.rightShiftOfRocket);
            printLineCharacters(rocket.sizeOfPartsRocket * 2 - 1 + row * 2, rocket.characterOfRocket);
            System.out.println();
        }

        Rectangle partOfBodyOfRocket = new Rectangle(rocket.sizeOfPartsRocket * 2 - 1,
                rocket.sizeOfPartsRocket + rocket.rightShiftOfRocket, rocket.characterOfRocket, false);
        print(partOfBodyOfRocket);

        for(int row = 0; row < rocket.sizeOfPartsRocket + 1; row++) {
            printLineWhitespaces(rocket.sizeOfPartsRocket - row + rocket.rightShiftOfRocket);
            printLineCharacters(rocket.sizeOfPartsRocket * 2 - 1 + row * 2, rocket.characterOfRocket);
            System.out.println();
        }
    }
}