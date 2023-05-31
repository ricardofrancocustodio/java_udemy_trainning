package JavaUdemyTrainning.Matrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Spiral Order Traversal:
 * Write a Java program to print the elements of a 2D array
 * in spiral order, starting from the top-left corner and
 * moving in a clockwise direction.
 *
 * Ajuda do chatGPT -  não consegui fazer. Fui encadeando um loop dentro do outro
 *
 * */
public class SpiralOrderTraversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> result =  new ArrayList<>();
        System.out.print("Size of the square: ");
        int size = scanner.nextInt();

        Integer[][] matrix = new Integer[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(Integer[] el : matrix){
            System.out.println(Arrays.toString(el));
        }

        int top = 0;
        int bottom = matrix.length -1;
        int left = 0;
        int right = matrix[0].length -1 ;


        //quando voltar tem de voltar a ler a proxima linha
       while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++) {
               result.add(matrix[top][i]);
               System.out.println(result);
            }
                top++;

            for(int i=top; i<=bottom; i++){
               result.add(matrix[i][right]);
               System.out.println(result);
            }
            right--;

            if(top <= bottom){
                for (int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                    System.out.println(result);
                }
                bottom--;
            }

            if(left <= right){
                for (int i = bottom; i >= top ; i--) {
                    result.add(matrix[i][left]);
                    System.out.println(result);
                }
                left++;
            }

       }

        System.out.println("-----------------");
        System.out.println(result);

    }
}

