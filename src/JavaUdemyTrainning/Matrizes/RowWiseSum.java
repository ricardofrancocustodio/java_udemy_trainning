package JavaUdemyTrainning.Matrizes;

import java.util.Scanner;

/***
 *Row-wise Sum:
 * Write a Java program to calculate the sum of each row
 * in a given 2D array and store the results in a separate 1D array.
 */
public class RowWiseSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer result = 0;
        Integer res = 0;


        System.out.print("How many lines? ");
        int lines = scanner.nextInt();

        System.out.print("How many columns? ");
        int columns = scanner.nextInt();

        Integer[][] matrix = new Integer[lines][columns];

        System.out.println("Insert the numbers of the grid: ");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                result += matrix[i][j];

            }
        }


        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j <= matrix[i].length -1; j++) {
                        res += matrix[i][j];
            }

            System.out.println("Sum of the "+ (i+1) +"º row: " + res);
            res = 0;
        }


        scanner.close();
    }



}
