package org.mvc.ChildModels;

import org.mvc.Models.Rectangle;

public class MirroredParallelogram extends Rectangle {
    private boolean isSpecialCaseTrapeze;

    public MirroredParallelogram() {}

    public MirroredParallelogram(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape, boolean isSpecialCaseTrapeze) {
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
        return "MirroredParallelogram " +
                "isSpecialCaseTrapeze=" + this.isSpecialCaseTrapeze +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.isSpecialCaseTrapeze == ((MirroredParallelogram) obj).isSpecialCaseTrapeze;
    }
}
