package org.mvc.ChildModels;

import org.mvc.Models.Shape;

public class ChristmasTree extends Shape {
    private int countOfTriangles;
    private int maxSizeOfTriangle;

    public ChristmasTree() {}

    public ChristmasTree(int sizeOfShape, int rightShiftOfShape, char characterOfShape) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape);
        this.countOfTriangles = sizeOfShape;
        this.maxSizeOfTriangle = sizeOfShape;
    }

    public int getCountOfTriangles() {
        return countOfTriangles;
    }

    public void setCountOfTriangles(int countOfTriangles) {
        this.countOfTriangles = countOfTriangles;
    }

    public int getMaxSizeOfTriangle() {
        return maxSizeOfTriangle;
    }

    public void setMaxSizeOfTriangle(int maxSizeOfTriangle) {
        this.maxSizeOfTriangle = maxSizeOfTriangle;
    }

    @Override
    public String toString() {
        return "ChristmasTree" +
                "countOfTriangles=" + countOfTriangles +
                ", maxSizeOfTriangle=" + maxSizeOfTriangle +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.countOfTriangles == ((ChristmasTree) obj).countOfTriangles &&
                this.maxSizeOfTriangle == ((ChristmasTree) obj).maxSizeOfTriangle;
    }
}
