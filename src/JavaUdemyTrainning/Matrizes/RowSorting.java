package JavaUdemyTrainning.Matrizes;

import java.util.*;

/**
 * Row Sorting: Write a Java program to sort each row of a given 2D array in ascending order.
 * Attention: Just sort THE ROW in an ascending order
 * Attention 2: not to order the numbers
 *
 * */
public class RowSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the square: ");
        int size = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();


        Integer[][] matrix = new Integer[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
                nums.add(matrix[i][j]);

            }
        }

        for(Integer[] el : matrix){
            System.out.println(Arrays.toString(el));
        }

        //Collections.sort(nums);

        System.out.println("------------------");
        //System.out.println(nums);



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length -1; j++) {
                if (matrix[j][0] > matrix[j + 1][0]) {
                    Integer[] temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }

        for(Integer[] el : matrix){
            System.out.println(Arrays.toString(el));
        }

    }
}
