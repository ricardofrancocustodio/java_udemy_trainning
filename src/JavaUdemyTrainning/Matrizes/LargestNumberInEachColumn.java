package JavaUdemyTrainning.Matrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Largest Number in Each Column:
 * Write a Java program to find the largest number in
 * each column of a given 2D array and store the results in a separate 1D array.
 * */
public class LargestNumberInEachColumn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();


        System.out.print("How many rows: ");
        int row = scanner.nextInt();
        System.out.print("How many columns: ");
        int column = scanner.nextInt();

        Integer[][] matrix =  new Integer[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-----------------");
        for( Integer[] el : matrix){
            System.out.println(Arrays.toString(el));
        }

        System.out.println("-----------------");
        int maxValue = matrix[0][0];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if(matrix[j][i] > maxValue){
                    maxValue = matrix[j][i];

                }
            }

            result.add(maxValue);
            System.out.println("ArrayList - Max value of the " + (i + 1) + "ª column is: " + result.get(i));
            System.out.println("For Loop  - Max value of the " + (i + 1) + "ª column is: " + maxValue);
            System.out.println("--------------------");
            maxValue = 0;
        }

    }
}
