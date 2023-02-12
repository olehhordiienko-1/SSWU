package MVC.TrianglesMVC;

public class ControllerAndView {
    // level 0
    static void printLineCharacters(int sizeOfColumn, char character) {
        for (int column = 0; column < sizeOfColumn; column++) {
            System.out.print(character);
        }
    }

    static void printLineWhitespaces(int sizeOfColumn, char whitespace) {
        for (int column = 0; column < sizeOfColumn; column++) {
            System.out.print(whitespace);
        }
    }

    // level 1
    static void print(UpTriangle upTriangle) {
        for (int row = 0; row < upTriangle.sizeOfTriangle; row++) {
            printLineWhitespaces(upTriangle.rightShiftOfTriangle, upTriangle.whitespaceOfTriangle);
            printLineCharacters(row + 1, upTriangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void print(DownTriangle downTriangle) {
        for (int row = 0; row < downTriangle.sizeOfTriangle; row++) {
            printLineWhitespaces(downTriangle.rightShiftOfTriangle, downTriangle.whitespaceOfTriangle);
            printLineCharacters(downTriangle.sizeOfTriangle - row, downTriangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void print(MirroredDownTriangle mirroredDownTriangle) {
        for (int row = 0; row < mirroredDownTriangle.sizeOfTriangle; row++) {
            printLineWhitespaces(mirroredDownTriangle.rightShiftOfTriangle
                    + row, mirroredDownTriangle.whitespaceOfTriangle);
            printLineCharacters(mirroredDownTriangle.sizeOfTriangle - row, mirroredDownTriangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void print(MirroredUpTriangle mirroredUpTriangle) {
        for (int row = 0; row < mirroredUpTriangle.sizeOfTriangle; row++) {
            printLineWhitespaces(mirroredUpTriangle.rightShiftOfTriangle
                    + mirroredUpTriangle.sizeOfTriangle - row - 1, mirroredUpTriangle.whitespaceOfTriangle);
            printLineCharacters(row + 1, mirroredUpTriangle.characterOfTriangle);
            System.out.println();
        }
    }

    static void print(Rectangle rectangle) {
        for (int row = 0; row < rectangle.sizeOfRectangle; row++) {
            printLineWhitespaces(rectangle.rightShiftOfRectangle, rectangle.whitespaceOfRectangle);
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
            printLineWhitespaces(trapeze.rightShiftOfTrapeze
                    + trapeze.sizeOfTrapeze - row - 1, trapeze.whitespaceOfTrapeze);
            printLineCharacters((row + additionForTrapeze) * 2 + additionForTriangle,
                    trapeze.characterOfTrapeze);
            System.out.println();
        }
    }

    // level 2
    static void print(SimpleParallelogram simpleParallelogram) {
        UpTriangle upTriangle = new UpTriangle(simpleParallelogram.sizeOfParallelogram,
                simpleParallelogram.rightShiftOfParallelogram, simpleParallelogram.characterOfParallelogram);
        ControllerAndView.print(upTriangle);

        if (simpleParallelogram.isSpecialCaseTrapeze) {
            Rectangle rectangle = new Rectangle(simpleParallelogram.sizeOfParallelogram,
                    simpleParallelogram.rightShiftOfParallelogram, upTriangle.characterOfTriangle);
            ControllerAndView.print(rectangle);
        }
        MirroredDownTriangle mirroredDownTriangle = new MirroredDownTriangle(simpleParallelogram.sizeOfParallelogram,
                simpleParallelogram.rightShiftOfParallelogram, simpleParallelogram.characterOfParallelogram);
        ControllerAndView.print(mirroredDownTriangle);
    }

    static void print(MirroredParallelogram mirroredParallelogram) {
        MirroredUpTriangle mirroredUpTriangle = new MirroredUpTriangle(mirroredParallelogram.sizeOfParallelogram,
                mirroredParallelogram.rightShiftOfParallelogram, mirroredParallelogram.characterOfParallelogram);
        ControllerAndView.print(mirroredUpTriangle);

        if(mirroredParallelogram.isSpecialCaseTrapeze) {
            Rectangle rectangle = new Rectangle(mirroredParallelogram.sizeOfParallelogram,
                    mirroredParallelogram.rightShiftOfParallelogram, mirroredParallelogram.characterOfParallelogram);
            ControllerAndView.print(rectangle);
        }

        DownTriangle downTriangle = new DownTriangle(mirroredParallelogram.sizeOfParallelogram,
                mirroredParallelogram.rightShiftOfParallelogram, mirroredParallelogram.characterOfParallelogram);
        ControllerAndView.print(downTriangle);
    }

    static void print(VerticalTriangle verticalTriangle) {
        UpTriangle upTriangle = new UpTriangle(verticalTriangle.sizeOfTriangle,
                verticalTriangle.rightShiftOfTriangle, verticalTriangle.characterOfTriangle);
        ControllerAndView.print(upTriangle);

        if (verticalTriangle.isSpecialCaseTrapeze) {
            Rectangle rectangle = new Rectangle(verticalTriangle.sizeOfTriangle,
                    verticalTriangle.rightShiftOfTriangle, upTriangle.characterOfTriangle);
            ControllerAndView.print(rectangle);
        }
        DownTriangle downTriangle = new DownTriangle(verticalTriangle.sizeOfTriangle - 1,
                verticalTriangle.rightShiftOfTriangle, verticalTriangle.characterOfTriangle);
        ControllerAndView.print(downTriangle);
    }

    static void print(MirroredVerticalTriangle mirroredVerticalTriangle) {
        MirroredUpTriangle mirroredUpTriangle = new MirroredUpTriangle(mirroredVerticalTriangle.sizeOfTriangle,
                mirroredVerticalTriangle.rightShiftOfTriangle, mirroredVerticalTriangle.characterOfTriangle);
        ControllerAndView.print(mirroredUpTriangle);

        if(mirroredVerticalTriangle.isSpecialCaseTrapeze) {
            Rectangle rectangle = new Rectangle(mirroredVerticalTriangle.sizeOfTriangle,
                    mirroredVerticalTriangle.rightShiftOfTriangle, mirroredVerticalTriangle.characterOfTriangle);
            ControllerAndView.print(rectangle);
        }

        MirroredDownTriangle mirroredDownTriangle = new MirroredDownTriangle(mirroredVerticalTriangle.sizeOfTriangle - 1,
                mirroredVerticalTriangle.rightShiftOfTriangle + 1, mirroredVerticalTriangle.characterOfTriangle);
        ControllerAndView.print(mirroredDownTriangle);
    }

    // level 3
    static void print(ChristmasTree christmasTree) {
        for(int elements = 0; elements < christmasTree.countOfTriangles; elements++) {
            for(int row = 0; row < elements + 1; row++) {
                printLineWhitespaces((christmasTree.maxSizeOfTriangle - row - 1) + christmasTree.rightShiftOfTriangle,
                        christmasTree.whitespaceOfTree);
                printLineCharacters(row * 2 + 1, christmasTree.characterOfTree);
                System.out.println();
            }
        }

        Rectangle rectangle = new Rectangle(christmasTree.maxSizeOfTriangle / 2,
                christmasTree.rightShiftOfTriangle + (christmasTree.maxSizeOfTriangle - (christmasTree.maxSizeOfTriangle / 4) - 1), christmasTree.characterOfTree);
        print(rectangle);
    }

    static void print(Rocket rocket) {
        Trapeze headOfRocket = new Trapeze(rocket.sizeOfRocket,
                rocket.sizeOfRocket + rocket.rightShiftOfRocket, rocket.characterOfRocket, true);
        print(headOfRocket);

        for(int row = 0; row < rocket.sizeOfRocket / 2; row++) {
            printLineWhitespaces(rocket.sizeOfRocket + rocket.rightShiftOfRocket, rocket.whitespaceOfRocket);
            printLineCharacters(rocket.sizeOfRocket * 2 - 1, rocket.characterOfRocket);
            System.out.println();
        }

        for(int row = 0; row < rocket.sizeOfRocket / 2; row++) {
            printLineWhitespaces(rocket.sizeOfRocket - row + rocket.rightShiftOfRocket, rocket.whitespaceOfRocket);
            printLineCharacters(rocket.sizeOfRocket * 2 - 1 + row * 2, rocket.characterOfRocket);
            System.out.println();
        }

        Rectangle partOfBodyOfRocket = new Rectangle(rocket.sizeOfRocket * 2 - 1,
                rocket.sizeOfRocket + rocket.rightShiftOfRocket, rocket.characterOfRocket);
        print(partOfBodyOfRocket);

        for(int row = 0; row < rocket.sizeOfRocket + 1; row++) {
            printLineWhitespaces(rocket.sizeOfRocket - row + rocket.rightShiftOfRocket, rocket.whitespaceOfRocket);
            printLineCharacters(rocket.sizeOfRocket * 2 - 1 + row * 2, rocket.characterOfRocket);
            System.out.println();
        }
    }
}