public class Solutions {
    public static int[][] scale(int[][] matrix, int scaleFactor) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= scaleFactor;
            }
        }
        return matrix;//fasd
    }

    public static int findDeterminant(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            System.out.println("Invalid");
            return 0;
        }

}
