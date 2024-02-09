public class Solutions {
    //make matrix/2d array of ints for 2x2 and 3x3 and make 2x2 for scaling algorithm to test it
    int [][]matrixNader2x2 = new int[][]{{1,4,2}, {3,6,8}};
    int [][]matrixBen3x3 = new int[][]{{3,9,1}, {5,7,3},{2,8,2}};
    int [][]matrixForScale = new int[][]{{4,5,9}, {1,2,3}};
    int scaleFactor = 2;


    //multiply each value in the 2D array by that scaling factor and return array
    public static int[][] scale(int[][] matrixForScale, int scaleFactor) {
        for (int i = 0; i < matrixForScale.length; i++) {
            for (int j = 0; j < matrixForScale[i].length; j++) {
                matrixForScale[i][j] *= scaleFactor;
            }
        }
        return matrixForScale;
    }

    //multiply matrixForScale and matrixNader2x2 (which are the same size)
    public static int[][] multiplyMatrices(int[][] matrixForScale, int[][]matrixNader2x2) {
    }

    //find Determinant of the 2x2
    public static int findDeterminant2x2(int[][] matrixNader2x2) {
        }
    //find Determinant of the 3x3
    public static int findDeterminant3x3(int[][] matrixBen3x3) {

        }
}
}


