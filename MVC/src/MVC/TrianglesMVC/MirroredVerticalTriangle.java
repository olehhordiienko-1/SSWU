package MVC.TrianglesMVC;

public class MirroredVerticalTriangle {
    int sizeOfTriangle;
    int rightShiftOfTriangle;
    char whitespaceOfTriangle;
    char characterOfTriangle;
    boolean isSpecialCaseTrapeze;

    MirroredVerticalTriangle(int size, int rightShift, char character, boolean isTrapeze) {
        sizeOfTriangle = size;
        rightShiftOfTriangle = rightShift;
        characterOfTriangle = character;
        isSpecialCaseTrapeze = isTrapeze;
        whitespaceOfTriangle = ' ';
    }
}
