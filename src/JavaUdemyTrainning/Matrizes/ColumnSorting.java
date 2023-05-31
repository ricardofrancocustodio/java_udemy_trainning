package JavaUdemyTrainning.Matrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColumnSorting {

    /**
     * Column Sorting:
     * Write a Java program to sort each column of a given 2D array in descending order.
     *
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the square: ");
        int size = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();


        Integer[][] matrix = new Integer[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
               // nums.add(matrix[i][j]);
            }
        }

        System.out.println("------------------");
        for(Integer[] el : matrix){
            System.out.println(Arrays.toString(el));
        }




        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                 nums.add(matrix[j][i]);
            }
        }

        System.out.println("------------------");
        System.out.println(nums);
        System.out.println("------------------");



    }
}
