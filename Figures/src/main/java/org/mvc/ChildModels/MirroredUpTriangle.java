package org.mvc.ChildModels;

import org.mvc.Models.Triangle;

public class MirroredUpTriangle extends Triangle {
    public MirroredUpTriangle() {}

    public MirroredUpTriangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape, modelOfShape);
    }

    @Override
    public String toString() {
        return "MirroredUpTriangle " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
