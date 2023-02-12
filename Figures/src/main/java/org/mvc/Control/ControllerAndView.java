package org.mvc.Control;

import org.mvc.ChildModels.*;
import org.mvc.Models.*;

public class ControllerAndView {
    // level 0
    public static void printLineCharacters(int sizeOfColumn, char character) {
        for (int column = 0; column < sizeOfColumn; column++) {
            System.out.print(character);
        }
    }

    public  static void printLineWhitespaces(int sizeOfColumn) {
        for (int column = 0; column < sizeOfColumn; column++) {
            System.out.print(' ');
        }
    }

    // level 1
    public  static void print(UpTriangle upTriangle) {
        for (int row = 0; row < upTriangle.getSizeOfShape(); row++) {
            printLineWhitespaces(upTriangle.getRightShiftOfShape());
            printLineCharacters(row + 1, upTriangle.getCharacterOfShape());
            System.out.println();
        }
    }

    public static void print(DownTriangle downTriangle) {
        for (int row = 0; row < downTriangle.getSizeOfShape(); row++) {
            printLineWhitespaces(downTriangle.getRightShiftOfShape());
            printLineCharacters(downTriangle.getSizeOfShape() - row, downTriangle.getCharacterOfShape());
            System.out.println();
        }
    }

    public static void print(MirroredDownTriangle mirroredDownTriangle) {
        for (int row = 0; row < mirroredDownTriangle.getSizeOfShape(); row++) {
            printLineWhitespaces(mirroredDownTriangle.getRightShiftOfShape()
                    + row);
            printLineCharacters(mirroredDownTriangle.getSizeOfShape() - row, mirroredDownTriangle.getCharacterOfShape());
            System.out.println();
        }
    }

    public static void print(MirroredUpTriangle mirroredUpTriangle) {
        for (int row = 0; row < mirroredUpTriangle.getSizeOfShape(); row++) {
            printLineWhitespaces(mirroredUpTriangle.getRightShiftOfShape()
                    + mirroredUpTriangle.getSizeOfShape() - row - 1);
            printLineCharacters(row + 1, mirroredUpTriangle.getCharacterOfShape());
            System.out.println();
        }
    }

    public static void print(Rectangle rectangle) {
        for (int row = 0; row < rectangle.getSizeOfShape(); row++) {
            printLineWhitespaces(rectangle.getRightShiftOfShape());
            printLineCharacters(rectangle.getSizeOfShape(), rectangle.getCharacterOfShape());
            System.out.println();
        }
    }

    public static void print(Trapeze trapeze) {
        int additionForTriangle;
        int additionForTrapeze;
        if (trapeze.isSpecialCaseTriangle()) {
            additionForTrapeze = 0;
            additionForTriangle = 1;
        } else {
            additionForTrapeze = 1;
            additionForTriangle = 0;
        }

        for (int row = 0; row < trapeze.getSizeOfShape(); row++) {
            printLineWhitespaces(trapeze.getRightShiftOfShape()
                    + trapeze.getSizeOfShape() - row - 1);
            printLineCharacters((row + additionForTrapeze) * 2 + additionForTriangle,
                    trapeze.getCharacterOfShape());
            System.out.println();
        }
    }

    // level 2
    public static void print(SimpleParallelogram simpleParallelogram) {
        UpTriangle upTriangle = new UpTriangle(simpleParallelogram.getSizeOfShape(),
                simpleParallelogram.getRightShiftOfShape(), simpleParallelogram.getCharacterOfShape(), "UpTriangle");
        ControllerAndView.print(upTriangle);

        if (simpleParallelogram.isSpecialCaseTrapeze()) {
            Rectangle rectangle = new Rectangle(simpleParallelogram.getSizeOfShape(),
                    simpleParallelogram.getRightShiftOfShape(), upTriangle.getCharacterOfShape(), "Rectangle");
            ControllerAndView.print(rectangle);
        }
        MirroredDownTriangle mirroredDownTriangle = new MirroredDownTriangle(simpleParallelogram.getSizeOfShape(),
                simpleParallelogram.getRightShiftOfShape(), simpleParallelogram.getCharacterOfShape(), "MirroredDownTriangle");
        ControllerAndView.print(mirroredDownTriangle);
    }

    public static void print(MirroredParallelogram mirroredParallelogram) {
        MirroredUpTriangle mirroredUpTriangle = new MirroredUpTriangle(mirroredParallelogram.getSizeOfShape(),
                mirroredParallelogram.getRightShiftOfShape(), mirroredParallelogram.getCharacterOfShape(), "MirroredUpTriangle");
        ControllerAndView.print(mirroredUpTriangle);

        if(mirroredParallelogram.isSpecialCaseTrapeze()) {
            Rectangle rectangle = new Rectangle(mirroredParallelogram.getSizeOfShape(),
                    mirroredParallelogram.getRightShiftOfShape(), mirroredParallelogram.getCharacterOfShape(), "Rectangle");
            ControllerAndView.print(rectangle);
        }

        DownTriangle downTriangle = new DownTriangle(mirroredParallelogram.getSizeOfShape(),
                mirroredParallelogram.getRightShiftOfShape(), mirroredParallelogram.getCharacterOfShape(), "DownTriangle");
        ControllerAndView.print(downTriangle);
    }

    public static void print(VerticalTriangle verticalTriangle) {
        UpTriangle upTriangle = new UpTriangle(verticalTriangle.getSizeOfShape(),
                verticalTriangle.getRightShiftOfShape(), verticalTriangle.getCharacterOfShape(), "UpTriangle");
        ControllerAndView.print(upTriangle);

        if (verticalTriangle.isSpecialCaseTrapeze()) {
            Rectangle rectangle = new Rectangle(verticalTriangle.getSizeOfShape(),
                    verticalTriangle.getRightShiftOfShape(), upTriangle.getCharacterOfShape(), "Rectangle");
            ControllerAndView.print(rectangle);
        }
        DownTriangle downTriangle = new DownTriangle(verticalTriangle.getSizeOfShape() - 1,
                verticalTriangle.getRightShiftOfShape(), verticalTriangle.getCharacterOfShape(), "DownTriangle");
        ControllerAndView.print(downTriangle);
    }

    public static void print(MirroredVerticalTriangle mirroredVerticalTriangle) {
        MirroredUpTriangle mirroredUpTriangle = new MirroredUpTriangle(mirroredVerticalTriangle.getSizeOfShape(),
                mirroredVerticalTriangle.getRightShiftOfShape(), mirroredVerticalTriangle.getCharacterOfShape(), "MirroredUpTriangle");
        ControllerAndView.print(mirroredUpTriangle);

        if(mirroredVerticalTriangle.isSpecialCaseTrapeze()) {
            Rectangle rectangle = new Rectangle(mirroredVerticalTriangle.getSizeOfShape(),
                    mirroredVerticalTriangle.getRightShiftOfShape(), mirroredVerticalTriangle.getCharacterOfShape(), "Rectangle");
            ControllerAndView.print(rectangle);
        }

        MirroredDownTriangle mirroredDownTriangle = new MirroredDownTriangle(mirroredVerticalTriangle.getSizeOfShape() - 1,
                mirroredVerticalTriangle.getRightShiftOfShape() + 1, mirroredVerticalTriangle.getCharacterOfShape(), "MirroredDownTriangle");
        ControllerAndView.print(mirroredDownTriangle);
    }

    // level 3
    static void print(ChristmasTree christmasTree) {
        for(int elements = 0; elements < christmasTree.getCountOfTriangles(); elements++) {
            for(int row = 0; row < elements + 1; row++) {
                printLineWhitespaces((christmasTree.getMaxSizeOfTriangle() - row - 1) + christmasTree.getRightShiftOfShape());
                printLineCharacters(row * 2 + 1, christmasTree.getCharacterOfShape());
                System.out.println();
            }
        }

        Rectangle rectangle = new Rectangle(christmasTree.getMaxSizeOfTriangle() / 2,
                christmasTree.getRightShiftOfShape() + (christmasTree.getMaxSizeOfTriangle() - (christmasTree.getMaxSizeOfTriangle() / 4) - 1), christmasTree.getCharacterOfShape(), "Stump");
        print(rectangle);
    }

    static void print(Rocket rocket) {
        Trapeze headOfRocket = new Trapeze(rocket.getSizeOfShape(),
                rocket.getSizeOfShape() + rocket.getRightShiftOfShape(), rocket.getCharacterOfShape(), "Header", true);
        print(headOfRocket);

        for(int row = 0; row < rocket.getSizeOfShape() / 2; row++) {
            printLineWhitespaces(rocket.getSizeOfShape() + rocket.getRightShiftOfShape());
            printLineCharacters(rocket.getSizeOfShape() * 2 - 1, rocket.getCharacterOfShape());
            System.out.println();
        }

        for(int row = 0; row < rocket.getSizeOfShape() / 2; row++) {
            printLineWhitespaces(rocket.getSizeOfShape() - row + rocket.getRightShiftOfShape());
            printLineCharacters(rocket.getSizeOfShape() * 2 - 1 + row * 2, rocket.getCharacterOfShape());
            System.out.println();
        }

        Rectangle partOfBodyOfRocket = new Rectangle(rocket.getSizeOfShape() * 2 - 1,
                rocket.getSizeOfShape() + rocket.getRightShiftOfShape(), rocket.getCharacterOfShape(), "Body");
        print(partOfBodyOfRocket);

        for(int row = 0; row < rocket.getSizeOfShape() + 1; row++) {
            printLineWhitespaces(rocket.getSizeOfShape() - row + rocket.getRightShiftOfShape());
            printLineCharacters(rocket.getSizeOfShape() * 2 - 1 + row * 2, rocket.getCharacterOfShape());
            System.out.println();
        }
    }
}