package JavaUdemyTrainning.Matrizes;

import java.util.Scanner;

/**
 * Find Maximum Element:
 * Write a Java program to find the maximum element
 * in a given 2D array and print its position (row and column).
 *
 * */
public class FindMaximumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer tempResult = 0;

        System.out.print("How many lines? ");
        int lines = scanner.nextInt();

        System.out.print("How many columns? ");
        int columns = scanner.nextInt();

        Integer[][] matrix = new Integer[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxValue = matrix[0][0];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum element = " + maxValue);
    }
}
