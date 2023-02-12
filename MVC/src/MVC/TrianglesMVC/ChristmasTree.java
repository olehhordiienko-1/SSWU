package MVC.TrianglesMVC;

public class ChristmasTree {
    int countOfTriangles;
    int maxSizeOfTriangle;
    int rightShiftOfTriangle;
    char characterOfTree;
    char whitespaceOfTree;

    ChristmasTree(int countOfElements, int rightShift, char character) {
        countOfTriangles = countOfElements;
        maxSizeOfTriangle = countOfElements;
        rightShiftOfTriangle = rightShift;
        characterOfTree = character;
        whitespaceOfTree = ' ';
    }
}
