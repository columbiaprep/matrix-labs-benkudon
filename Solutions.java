public class Solutions {
        //scale any matrix by scale factor nested for loop
        public static int[][] scale(int[][] matrix, int scaleFactor) {
                for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                                matrix[i][j] *= scaleFactor;
                        }
                }
                return matrix;
        }

        //multiply matrices (that are the same length)
        public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
                if (matrix1[0].length != matrix2.length) {
                        System.out.println("Don't multiply me bro");
                        return null;
                }
                int[][] result = new int[matrix1.length][matrix2[0].length];
                for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix2[0].length; j++) {
                                for (int k = 0; k < matrix1[0].length; k++) {
                                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                                }
                        }
                }
                return result;
        }

        //find determinant of 2x2 matrix
        public static int findDeterminant2x2(int[][] matrix) {
                if (matrix.length != 2 || matrix[0].length != 2) {
                        System.out.println("Wrong wrong wrong size for 2x2!!!");
                        return 0;
                }
                return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        //find determinant of 3x3 matrix
        public static int findDeterminant3x3(int[][] matrix) {
                if (matrix.length != 3 || matrix[0].length != 3) {
                        System.out.println("Wrong wrong wrong size for 3x3!!!");
                        return 0;
                }
                return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                        matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                        matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }//not sure if this is how it should be done, but i coded the whole thing out took me like an hour to figure it out with the math. very annoying but prob useful :)
}
