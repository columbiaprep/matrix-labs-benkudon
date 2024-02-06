public class Solutions {
    public static int[][] scale(int[][] matrix, int scaleFactor) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= scaleFactor;
            }
        }
        return matrix;//fasd
    }

}
