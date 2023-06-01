package JavaUdemyTrainning.Matrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Transpose Matrix: Write a Java program to find the transpose
 * of a given 2D matrix. The transpose of a matrix is obtained
 * by changing rows to columns and columns to rows.
 *
 * */
public class TransposeMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many lines? ");
        int lines = scanner.nextInt();

        System.out.print("How many columns? ");
        int columns = scanner.nextInt();

        Integer[][] matrix = new Integer[lines][columns];
        Integer[][] matrixTransposed = new Integer[columns][lines];
        ArrayList<Integer> tempResult = new ArrayList<>();

        System.out.println("Insert the numbers of the grid: ");

        for (int i = 0; i < lines ; i++) {
            for (int j = 0; j < columns   ; j++) {
                matrix[i][j] = scanner.nextInt();
                tempResult.add(matrix[i][j]);

            }

        }
        System.out.println("-----------------");
        System.out.println(tempResult);
        System.out.println("-----------------");

        int count = 0;

        for (int i = 0; i < columns ; i++) {
            for (int j = 0; j < lines  ; j++) {
                matrixTransposed[j][i] = tempResult.get(count);
                count++;

            }

        }

        for( Integer[] el : matrix){
            System.out.println(Arrays.toString(el));
        }
        System.out.println("-----------------");

        for(Integer[] el : matrixTransposed){
            System.out.println(Arrays.toString(el));
        }


    }


}
