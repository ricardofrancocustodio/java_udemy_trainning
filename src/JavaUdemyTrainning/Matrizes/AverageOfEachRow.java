package JavaUdemyTrainning.Matrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Average of Each Row:
 * Write a Java program to calculate the average of
 * each row in a given 2D array and store the results in a separate 1D array.
 *
 * */
public class AverageOfEachRow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> avg = new ArrayList<>();
        Integer sum = 0;
        float average = 0f;

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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }

            average = sum / (float)row;
            avg.add(average);
            System.out.println("Average of the " + (i + 1) + "ª row sum: " + average);
            sum = 0;
        }

        System.out.println("-----------------");
        System.out.println(avg);

    }

}
