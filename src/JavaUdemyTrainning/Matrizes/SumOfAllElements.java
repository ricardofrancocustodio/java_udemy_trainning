package JavaUdemyTrainning.Matrizes;

import java.util.Scanner;

public class SumOfAllElements {

    /**
     * Sum of all Elements:
     * Write a Java program to find the sum of all elements in a given 2D array.
     *
     * */
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        Integer result = 0;

        System.out.print("How many lines? ");
        int lines = scanner.nextInt();

        System.out.print("How many columns? ");
        int columns = scanner.nextInt();

        Integer[][] matrix = new Integer[lines][columns];

        System.out.println("Insert the numbers to sum: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
                result += matrix[i][j];
            }

        }

        System.out.println("Sum of all elements = " + result);

        scanner.close();
    }

}
