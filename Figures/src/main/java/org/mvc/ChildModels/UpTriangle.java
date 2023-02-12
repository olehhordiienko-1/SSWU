package org.mvc.ChildModels;

import org.mvc.Models.Triangle;

public class UpTriangle extends Triangle {
    public UpTriangle() {}

    public UpTriangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape, modelOfShape);
    }

    @Override
    public String toString() {
        return "UpTriangle " +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
