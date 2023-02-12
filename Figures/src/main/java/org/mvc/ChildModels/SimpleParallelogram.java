package org.mvc.ChildModels;

import org.mvc.Models.Rectangle;

public class SimpleParallelogram extends Rectangle {
    private boolean isSpecialCaseTrapeze;

    public SimpleParallelogram() {}

    public SimpleParallelogram(int sizeOfShape, int rightShiftOfShape, char characterOfShape, String modelOfShape, boolean isSpecialCaseTrapeze) {
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
        return "SimpleParallelogram" +
                "isSpecialCaseTrapeze=" + isSpecialCaseTrapeze +
                super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) &&
                this.isSpecialCaseTrapeze == ((SimpleParallelogram) obj).isSpecialCaseTrapeze;
    }
}
