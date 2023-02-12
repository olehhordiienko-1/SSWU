package MVC.Triangles2MVC;

public class Trapeze {
    int sizeOfTrapeze;
    int rightShiftOfTrapeze;
    char characterOfTrapeze;
    boolean isSpecialCaseTriangle;

    Trapeze(int height, int rightShift, char character, boolean isTriangle) {
        sizeOfTrapeze = height;
        rightShiftOfTrapeze = rightShift;
        characterOfTrapeze = character;
        isSpecialCaseTriangle = isTriangle;
    }
}
