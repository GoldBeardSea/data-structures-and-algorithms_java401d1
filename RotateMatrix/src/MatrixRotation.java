public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        int matrixSize = 3;
        rotateMatrix(matrixSize, matrix);
        int[][] expected = {
                {3, 2, 1},
                {3, 2, 1},
                {3, 2, 1}
        };

        }
    public static void rotateMatrix(int matrixSize, int[][] matrix) {
        for (int row = 0; row < matrixSize / 2; row++) {
            for (int col = row; col < matrixSize - row - 1; col++) {
                int tempCell = matrix[row][col];
                matrix[row][col] = matrix[col][matrixSize - 1 - row];
                matrix[col][matrixSize - 1 - row] = matrix[matrixSize - 1 -row][matrixSize - 1 - col];
                matrix[matrixSize - 1 - row][matrixSize - 1 - col] = matrix[matrixSize - 1 -col][row];
                matrix[matrixSize - 1 - col][row] = tempCell;
            }
        }
        printMatrix(matrixSize, matrix);
    }

    public static void printMatrix(int matrixSize, int[][] matrix) {
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");


    }
}
