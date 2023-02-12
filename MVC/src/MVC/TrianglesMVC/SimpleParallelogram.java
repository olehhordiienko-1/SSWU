package MVC.TrianglesMVC;

public class SimpleParallelogram {
    int sizeOfParallelogram;
    int rightShiftOfParallelogram;
    char whitespaceOfParallelogram;
    char characterOfParallelogram;
    boolean isSpecialCaseTrapeze;

    SimpleParallelogram(int size, int rightShift, char character, boolean isTrapeze) {
        sizeOfParallelogram = size;
        rightShiftOfParallelogram = rightShift;
        characterOfParallelogram = character;
        isSpecialCaseTrapeze = isTrapeze;
        whitespaceOfParallelogram = ' ';
    }
}
