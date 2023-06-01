package JavaUdemyTrainning.Matrizes.MatrixMultiplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Matrix Multiplication:
 * Write a Java program to multiply two given matrices and store the result in a new 2D array.
 *
 * */
public class MatrixMultiplication {

    public int[][] multiplyMatrices(int[][] matrixOne, int[][] matrixTwo) {
        int[][] result = new int[matrixOne.length][matrixTwo.length];
        List<Integer> mOne = new ArrayList<>();
        List<Integer> mTwo = new ArrayList<>();

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                mOne.add(matrixOne[i][j]);
            }
        }

        //System.out.println(mOne);

        for (int m = 0; m < matrixTwo.length; m++) {
            for (int n = 0; n < matrixTwo[0].length; n++) {
                mTwo.add(matrixTwo[m][n]);
            }
        }

        //System.out.println(mTwo);

        int count = 0;

        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result[0].length; l++) {
                result[k][l] = mOne.get(count) * mTwo.get(count);
                count++;
            }
        }

        return result;

    }


}
