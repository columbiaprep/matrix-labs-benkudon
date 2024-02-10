public class Main {
    public static void main(String[] args) {
        //test matrices - pretty obvious usages
        int[][] matrixNader2x2 = {{1, 2}, {3, 4}};
        int[][] matrixBen3x3 = {{3, 9, 1}, {5, 7, 3}, {2, 8, 2}};
        int[][] matrixForScale = {{4, 5}, {1, 2}};
        int scaleFactor = 2;

        //scale matrixForScale by scaleFactor
        int[][] scaledMatrix = Solutions.scale(matrixForScale, scaleFactor);
        System.out.println("Scaled Matrix:");
        printMatrix(scaledMatrix);

        //multiply matrixForScale by matrixNader2x2
        int[][] multipliedMatrix = Solutions.multiplyMatrices(matrixForScale, matrixNader2x2);
        System.out.println("Multiplied Matrix:");
        printMatrix(multipliedMatrix);

        //find determinant of matrixNader2x2
        int determinant2x2 = Solutions.findDeterminant2x2(matrixNader2x2);
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2);

        //find determinant of matrixBen3x3
        int determinant3x3 = Solutions.findDeterminant3x3(matrixBen3x3);
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3);
    }

    //printing all matrices using enhanced for loop and nested for each in (enhanced)
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
