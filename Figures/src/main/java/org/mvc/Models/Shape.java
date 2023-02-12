package org.mvc.Models;

public class Shape {
    private int sizeOfShape;
    private int rightShiftOfShape;
    private char characterOfShape;

    public Shape() {}

    public Shape(int sizeOfShape, int rightShiftOfShape, char characterOfShape) {
        this.sizeOfShape = sizeOfShape;
        this.rightShiftOfShape = rightShiftOfShape;
        this.characterOfShape = characterOfShape;
    }

    public int getSizeOfShape() {
        return sizeOfShape;
    }

    public void setSizeOfShape(int sizeOfShape) {
        this.sizeOfShape = sizeOfShape;
    }

    public int getRightShiftOfShape() {
        return rightShiftOfShape;
    }

    public void setRightShiftOfShape(int rightShiftOfShape) {
        this.rightShiftOfShape = rightShiftOfShape;
    }

    public char getCharacterOfShape() {
        return characterOfShape;
    }

    public void setCharacterOfShape(char characterOfShape) {
        this.characterOfShape = characterOfShape;
    }

    @Override
    public String toString() {
        return "Shape" +
                "sizeOfShape=" + sizeOfShape +
                ", rightShiftOfShape=" + rightShiftOfShape +
                ", characterOfShape=" + characterOfShape;
    }

    @Override
    public boolean equals(Object obj) {
        return this.sizeOfShape == ((Shape) obj).sizeOfShape &&
                this.rightShiftOfShape == ((Shape) obj).rightShiftOfShape &&
                this.characterOfShape == ((Shape) obj).characterOfShape;
    }
}
