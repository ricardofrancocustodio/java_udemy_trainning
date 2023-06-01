package JavaUdemyTrainning.Matrizes.MatrixMultiplication;

import java.util.Arrays;

public class MatrixMultiplicationRun {

    public static void main(String[] args) {
        MatrixMultiplication matrixMultiplication =  new MatrixMultiplication();

        //  int[][] matrix1 = {{1, 2}, {3, 4}};
        // int[][] matrix2 = {{9, 8}, {7, 6}};
        //int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] matrix1 = {{1, 2}, {4, 5}};
        int[][] matrix2 = {{9, 10}, {6, 7}};

        System.out.println(Arrays.deepToString(matrixMultiplication.multiplyMatrices(matrix1, matrix2)));
    }
}
