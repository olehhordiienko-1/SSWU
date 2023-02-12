package MVC.TrianglesMVC;

public class MirroredParallelogram {
    int sizeOfParallelogram;
    int rightShiftOfParallelogram;
    char whitespaceOfParallelogram;
    char characterOfParallelogram;
    boolean isSpecialCaseTrapeze;

    MirroredParallelogram(int size, int rightShift, char character, boolean isTrapeze) {
        sizeOfParallelogram = size;
        rightShiftOfParallelogram = rightShift;
        characterOfParallelogram = character;
        isSpecialCaseTrapeze = isTrapeze;
        whitespaceOfParallelogram = ' ';
    }
}
