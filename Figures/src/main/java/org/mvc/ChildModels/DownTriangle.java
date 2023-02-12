package org.mvc.ChildModels;

import org.mvc.Models.Triangle;


public class DownTriangle extends Triangle {
    public DownTriangle() {}

    public DownTriangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape, modelOfShape);
    }

    @Override
    public String toString() {
        return "DownTriangle " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
