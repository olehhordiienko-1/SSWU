package org.mvc.ChildModels;

import org.mvc.Models.Triangle;

public class MirroredDownTriangle extends Triangle {
    public MirroredDownTriangle() {}

    public MirroredDownTriangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape, modelOfShape);
    }

    @Override
    public String toString() {
        return "MirroredDownTriangle " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
