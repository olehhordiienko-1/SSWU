package MVC.TrianglesMVC;

public class Trapeze {
    int sizeOfTrapeze;
    int rightShiftOfTrapeze;
    char whitespaceOfTrapeze;
    char characterOfTrapeze;
    boolean isSpecialCaseTriangle;

    Trapeze(int size, int rightShift, char character, boolean isHorizontalTriangle) {
        sizeOfTrapeze = size;
        rightShiftOfTrapeze = rightShift;
        characterOfTrapeze = character;
        isSpecialCaseTriangle = isHorizontalTriangle;
        whitespaceOfTrapeze = ' ';
    }
}
