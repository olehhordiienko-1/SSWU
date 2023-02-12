package org.mvc.ChildModels;

import org.mvc.Models.Triangle;

public class MirroredVerticalTriangle extends Triangle {
    private boolean isSpecialCaseTrapeze;

    public MirroredVerticalTriangle() {}

    public MirroredVerticalTriangle(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape, boolean isSpecialCaseTrapeze) {
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
        return "MirroredVerticalTriangle" +
                "isSpecialCaseTrapeze=" + isSpecialCaseTrapeze +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.isSpecialCaseTrapeze == ((MirroredVerticalTriangle) obj).isSpecialCaseTrapeze;
    }
}
