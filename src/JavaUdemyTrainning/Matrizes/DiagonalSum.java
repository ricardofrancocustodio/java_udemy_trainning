package JavaUdemyTrainning.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer sum = 0;
        int count;

        System.out.print("Size of the square: ");
        int size = scanner.nextInt();

        Integer[][] matrix = new Integer[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("---------------");
        for (Integer[] el : matrix) {
            System.out.println(Arrays.toString(el));
        }

        System.out.println("---------------");
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
            System.out.println("The sum of numbers in diagonal -  first superior left to last inferior right: " + sum);


        System.out.println("---------------");
        sum = 0;
        count = matrix.length - 1;

        for (Integer[] el : matrix) {
            sum += el[count];
            count--;
        }
        System.out.println("The sum of numbers in diagonal -  last element superior right to first inferior left: " + sum);

    }


}