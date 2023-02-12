package org.mvc.Models;

public class Trapeze extends Shape {
    private String modelOfShape;
    private boolean isSpecialCaseTriangle;

    public Trapeze() {}

    public Trapeze(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape, boolean isSpecialCaseTriangle) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape);
        this.modelOfShape = modelOfShape;
        this.isSpecialCaseTriangle = isSpecialCaseTriangle;
    }

    public boolean isSpecialCaseTriangle() {
        return isSpecialCaseTriangle;
    }

    public void setSpecialCaseTriangle(boolean specialCaseTriangle) {
        isSpecialCaseTriangle = specialCaseTriangle;
    }

    public String getModelOfShape() {
        return modelOfShape;
    }

    public void setModelOfShape(String modelOfShape) {
        this.modelOfShape = modelOfShape;
    }

    @Override
    public String toString() {
        return "Trapeze" +
                "modelOfShape='" + modelOfShape + '\'' +
                "isSpecialCaseTriangle='" + isSpecialCaseTriangle + '\'' +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.modelOfShape.equals(((Trapeze) obj).modelOfShape) &&
                this.isSpecialCaseTriangle == ((Trapeze) obj).isSpecialCaseTriangle;
    }
}
