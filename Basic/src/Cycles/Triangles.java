package Cycles;

public class Triangles {
    public static void main(String[] args) {
        // над кожним методом, у багаторядкових коментаріях,
        // показаний приклад фігури, котру має виводити у консоль метод.
        int sizeOfShape = 6;

        //printAMirroredDownTriangle(sizeOfShape);

        //printADownTriangle(sizeOfShape);

//        printADownTriangle(sizeOfShape);
//        System.out.println();
//
//        printAUpTriangle(sizeOfShape);
//        System.out.println();
//
//        printAMirroredDownTriangle(sizeOfShape);
//        System.out.println();
//
//        printAMirroredUpTriangle(sizeOfShape);
//        System.out.println();
//
//        printARectangle(sizeOfShape);
//        System.out.println();
//
//        printAIsoscelesTriangle(sizeOfShape);
//        System.out.println();
//
//        printAParallelogram(sizeOfShape);
//        System.out.println();
//
//        printAMirroredIsoscelesTriangle(sizeOfShape);
//        System.out.println();
//
//        printAMirroredParallelogram(sizeOfShape);
//        System.out.println();
//
//        printATrapeze(sizeOfShape);
//        System.out.println();
//
//        printABigParallelogram(sizeOfShape);
//        System.out.println();
//
//        printAHorizontalTriangle(sizeOfShape);
//        System.out.println();
//
//        printAHorizontalTrapeze(sizeOfShape);
//        System.out.println();
//
        printAChristmasTree(sizeOfShape, 0);
        System.out.println();
    }

    /*
    ......
    .....
    ....
    ...
    ..
    .
     */
    public static void printADownTriangle(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int j = 0; j < sizeOfShape - i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
    .
    ..
    ...
    ....
    .....
    ......
     */
    public static void printAUpTriangle(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
     ......
      .....
       ....
        ...
         ..
          .
     */
    public static void printAMirroredDownTriangle(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < sizeOfShape - i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
             .
            ..
           ...
          ....
         .....
        ......
     */
    public static void printAMirroredUpTriangle(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int k = i; k < sizeOfShape; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
    ......
    ......
    ......
    ......
    ......
    ......
     */
    public static void printARectangle(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int j = 0; j < sizeOfShape; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
    .
    ..
    ...
    ....
    .....
    ......
    .....
    ....
    ...
    ..
    .
     */
    public static void printAIsoscelesTriangle(int sizeOfShape) {
        printAUpTriangle(sizeOfShape - 1);
        printADownTriangle(sizeOfShape);
    }

    /*
    .
    ..
    ...
    ....
    .....
    ......
    ......
     .....
      ....
       ...
        ..
         .
     */
    public static void printAParallelogram(int sizeOfShape) {
        printAUpTriangle(sizeOfShape - 1);
        printAMirroredDownTriangle(sizeOfShape);
    }

    /*
        .
       ..
      ...
     ....
    .....
   ......
    .....
     ....
      ...
       ..
        .
     */
    public static void printAMirroredIsoscelesTriangle(int sizeOfShape) {
        printAMirroredUpTriangle(sizeOfShape - 1);
        printAMirroredDownTriangle(sizeOfShape);
    }

    /*
         .
        ..
       ...
      ....
     .....
    ......
    .....
    ....
    ...
    ..
    .
     */
    public static void printAMirroredParallelogram(int sizeOfShape) {
        printAMirroredUpTriangle(sizeOfShape - 1);
        printADownTriangle(sizeOfShape);
    }

    /*
         .
        ..
       ...
      ....
     .....
    ......
    ......
    ......
    ......
    ......
    ......
     .....
      ....
       ...
        ..
         .
     */
    public static void printATrapeze(int sizeOfShape) {
        printAMirroredUpTriangle(sizeOfShape - 1);
        printARectangle(sizeOfShape);

        for (int i = 1; i < sizeOfShape; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = i; j < sizeOfShape; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
         .
        ..
       ...
      ....
     .....
    ......
    ......
    ......
    ......
    ......
    ......
    .....
    ....
    ...
    ..
    .
     */
    public static void printABigParallelogram(int sizeOfShape) {
        printAMirroredUpTriangle(sizeOfShape - 1);
        printARectangle(sizeOfShape);
        printADownTriangle(sizeOfShape - 1);
    }

    /*
          .
         ...
        .....
       .......
      .........
     ...........
     */
    public static void printAHorizontalTriangle(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int j = i; j < sizeOfShape; j++) {
                System.out.print(" ");
            }

            // i * 2 + 1 - аби вивід символів був непарний,
            // щоб форма трикутника була рівною
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    /*
         ........
        ..........
       ............
      ..............
     ................
    ..................
     */
    public static void printAHorizontalTrapeze(int sizeOfShape) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int k = i; k < sizeOfShape; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(".");
            }

            for (int j = 0; j < sizeOfShape; j++) {
                System.out.print(".");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(".");
            }

            System.out.println();
        }
    }

    /*
        Y
        X
       XXX
        Y
       YYY
      YYYYY
        X
       XXX
      XXXXX
     XXXXXXX
        Y
       YYY
      YYYYY
     YYYYYYY
    YYYYYYYYY
     */
    public static void printAChristmasTree(int amountOfTriangles, int rightShift) {
        for (int i = 0; i < amountOfTriangles; i++) {
            if (i % 2 == 1) {
                printAPartOfChristmasTree(i + 1, amountOfTriangles, rightShift, 'X');
            } else {
                printAPartOfChristmasTree(i + 1, amountOfTriangles, rightShift, 'Y');
            }
        }
    }

    private static void printAPartOfChristmasTree(int sizeOfShape, int maxSize, int rightShift, char signOfTree) {
        for (int i = 0; i < sizeOfShape; i++) {
            for (int j = 0; j < maxSize - i - 1 + rightShift; j++) {
                System.out.print(" ");
            }

            // i * 2 + 1 - аби вивід символів був непарний,
            // щоб форма трикутника була рівною
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.println(i * 2 + 1);
                System.out.print(signOfTree);
            }
            System.out.println();
        }
    }
}