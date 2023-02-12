package org.mvc.ChildModels;

import org.mvc.Models.Shape;
import org.mvc.Models.Triangle;

public class VerticalTriangle extends Triangle {
    private boolean isSpecialCaseTrapeze;

    public VerticalTriangle() {}

    public VerticalTriangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape, boolean isSpecialCaseTrapeze) {
        super(sizeOfShape, rightShiftOfShape, characterOfShape, modelOfShape);
        this.isSpecialCaseTrapeze = isSpecialCaseTrapeze;
    }

    public boolean isSpecialCaseTrapeze() {
        return isSpecialCaseTrapeze;
    }

    public void setSpecialCaseTrapeze(boolean specialCaseTrapeze) {
        isSpecialCaseTrapeze = specialCaseTrapeze;
    }

    @Override
    public String toString() {
        return "VerticalTriangle " +
                "isSpecialCaseTrapeze=" + isSpecialCaseTrapeze +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.isSpecialCaseTrapeze == ((VerticalTriangle) obj).isSpecialCaseTrapeze;
    }
}
