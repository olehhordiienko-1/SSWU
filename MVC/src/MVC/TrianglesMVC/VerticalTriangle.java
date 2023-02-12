package MVC.TrianglesMVC;

public class VerticalTriangle {
    int sizeOfTriangle;
    int rightShiftOfTriangle;
    char whitespaceOfTriangle;
    char characterOfTriangle;
    boolean isSpecialCaseTrapeze;

    VerticalTriangle(int size, int rightShift, char character, boolean isTrapeze) {
        sizeOfTriangle = size;
        rightShiftOfTriangle = rightShift;
        characterOfTriangle = character;
        isSpecialCaseTrapeze = isTrapeze;
        whitespaceOfTriangle = ' ';
    }
}
