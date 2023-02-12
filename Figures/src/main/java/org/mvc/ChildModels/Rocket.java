package org.mvc.ChildModels;

import org.mvc.Models.Shape;

public class Rocket extends Shape {
    private String modelOfShape;

    public Rocket() {}

    public Rocket(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape) {
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
        return "Rocket " +
                "modelOfShape='" + this.modelOfShape + '\'' +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.modelOfShape.equals(((Rocket) obj).modelOfShape);
    }
}
