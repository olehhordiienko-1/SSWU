package MVC.printShapes;

public class Model {
    int size;
    char character;
    char whitespace;
    int rightShift;

    Model(int specifiedSize, int specifiedRightShift, char specifiedCharacter) {
        size = specifiedSize;
        character = specifiedCharacter;
        rightShift = specifiedRightShift;
        whitespace = ' ';
    }
}
