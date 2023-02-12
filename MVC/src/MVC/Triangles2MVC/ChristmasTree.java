package MVC.Triangles2MVC;

public class ChristmasTree {
    int countOfElements;
    int sizeOfLastElement;
    int rightShiftOfTree;
    char characterOfTree;

    public ChristmasTree(int size, int rightShift, char character) {
        countOfElements = size;
        sizeOfLastElement = size;
        rightShiftOfTree = rightShift;
        characterOfTree = character;
    }
}
