package JavaUdemyTrainning.Matrizes.MatrixMultiplication;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MatrixMultiplicationTest extends MatrixMultiplication {

    @Test
    public void checkMultiply(){
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] result = multiplyMatrices(matrix1,matrix2);

       // Assert.assertEquals(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)), Arrays.deepToString(result));
        Assert.assertEquals("[[9, 16, 21], [24, 25, 24], [21, 16, 9]]", Arrays.deepToString(result));
    }

    @Test
    public void checkMultiplyZero(){
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 0, 9}};
        int[][] matrix2 = {{0, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] result = multiplyMatrices(matrix1,matrix2);

        // Assert.assertEquals(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)), Arrays.deepToString(result));
        Assert.assertEquals("[[0, 16, 21], [24, 25, 24], [21, 0, 9]]", Arrays.deepToString(result));
    }

    @Test
    public void checkMultiplyTwoIntegers(){
        int[][] matrix1 = {{99, 20, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] result = multiplyMatrices(matrix1,matrix2);

        // Assert.assertEquals(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)), Arrays.deepToString(result));
        Assert.assertEquals("[[891, 160, 21], [24, 25, 24], [21, 16, 9]]", Arrays.deepToString(result));
    }

    @Test
    public void checkMultiplyOneElement(){
        int[][] matrix1 = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{11,12,13,14}};
        int[][] matrix2 = {{9,10,11,12},{6,7,8,9},{3,4,5,6},{7,8,9,10}};

        int[][] result = multiplyMatrices(matrix1,matrix2);

        // Assert.assertEquals(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)), Arrays.deepToString(result));
        Assert.assertEquals("[[9, 20, 33, 48], [24, 35, 48, 63], [21, 32, 45, 60], [77, 96, 117, 140]]", Arrays.deepToString(result));
    }

    @Test
    public void checkMultiplyOneMatrix(){
        int[][] matrix1 = {{1,9}};
        int[][] matrix2 = {{9,8}};

        int[][] result = multiplyMatrices(matrix1,matrix2);

        // Assert.assertEquals(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)), Arrays.deepToString(result));
        Assert.assertEquals("[[9]]", Arrays.deepToString(result));
    }
    @Test
    public void checkMultiplyOneMatrixZero(){
        int[][] matrix1 = {{0,0}};
        int[][] matrix2 = {{0,0}};

        int[][] result = multiplyMatrices(matrix1,matrix2);

        // Assert.assertEquals(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)), Arrays.deepToString(result));
        Assert.assertEquals("[[0]]", Arrays.deepToString(result));
    }
}
