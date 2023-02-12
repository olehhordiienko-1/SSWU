package MVC.printShapes;

public class ControllerAndView {
    // level 0
    static void printLineCharacters(Model model, int sizeOfColumn) {
        for(int column = 0; column < sizeOfColumn; column++) {
            System.out.print(model.character);
        }
    }

    static void printLineWhitespaces(Model model, int sizeOfColumn) {
        for(int column = 0; column < sizeOfColumn; column++) {
            System.out.print(model.whitespace);
        }
    }

    // level 1
    static void printUpTriangle(Model model) {
        for(int row = 0; row < model.size; row++) {
            printLineWhitespaces(model, model.rightShift);
            printLineCharacters(model, row + 1);
            System.out.println();
        }
    }

    static void printDownTriangle(Model model) {
        for(int row = 0; row < model.size; row++) {
            printLineWhitespaces(model, model.rightShift);
            printLineCharacters(model, model.size - row);
            System.out.println();
        }
    }

    static void printMirroredDownTriangle(Model model) {
        for(int row = 0; row < model.size; row++) {
            printLineWhitespaces(model, model.rightShift + row);
            printLineCharacters(model, model.size - row);
            System.out.println();
        }
    }

    static void printMirroredUpTriangle(Model model) {
        for(int row = 0; row < model.size; row++) {
            printLineWhitespaces(model, model.rightShift + model.size - row - 1);
            printLineCharacters(model, row + 1);
            System.out.println();
        }
    }

    static void printRectangle(Model model) {
        for(int row = 0; row < model.size; row++) {
            printLineWhitespaces(model, model.rightShift);
            printLineCharacters(model, model.size);
            System.out.println();
        }
    }

    static void printHorizontalTriangle(Model model) {
        for(int row = 0; row < model.size; row++) {
            printLineWhitespaces(model, model.size - row - 1);
            printLineCharacters(model, row * 2 + 1);
            System.out.println();
        }
    }
}
