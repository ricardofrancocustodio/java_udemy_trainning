package JavaUdemyTrainning.Matrizes;
import java.util.Arrays;

public class ColumnSortingGPT {

        public static void sortColumnsDescending(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            for (int col = 0; col < cols; col++) {
                // Extract the column elements into a separate array
                int[] column = new int[rows];
                for (int row = 0; row < rows; row++) {
                    column[row] = matrix[row][col];
                }

                // Sort the column array in descending order
                Arrays.sort(column);
                reverse(column);

                // Update the matrix with the sorted column elements
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = column[row];
                }
            }
        }

        private static void reverse(int[] array) {
            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            System.out.println("Original matrix:");
            printMatrix(matrix);

            sortColumnsDescending(matrix);

            System.out.println("\nMatrix after sorting columns in descending order:");
            printMatrix(matrix);
        }

        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }


}
