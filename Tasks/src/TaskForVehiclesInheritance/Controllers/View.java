package TaskForVehiclesInheritance.Controllers;

import TaskForVehiclesInheritance.MainClasses.Owner;

public class View {
    public static void printIsInGarageCarForSpecifyOwner(boolean haveCarFromTheOwner, Owner owner) {
        if(haveCarFromTheOwner) {
            System.out.println(owner + " has got cars in specified garage");
        } else {
            System.out.println(owner + " hasn't got cars in specified garage");
        }
    }
}
