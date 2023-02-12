package org.mvc.Models;

public class Triangle extends Shape {
    private String modelOfShape;

    public Triangle() {
    }

    public Triangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape);
        this.modelOfShape = modelOfShape;
    }

    public String getModelOfShape() {
        return modelOfShape;
    }

    public void setModelOfShape(String modelOfShape) {
        this.modelOfShape = modelOfShape;
    }

    @Override
    public String toString() {
        return "Triangle" +
                "modelOfShape='" + modelOfShape + '\'' +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.modelOfShape.equals(((Triangle) obj).modelOfShape);
    }
}
