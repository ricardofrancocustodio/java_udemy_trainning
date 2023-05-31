package JavaUdemyTrainning.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer res = 0;
        String resul;

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
        System.out.print("Qual numero deseja encontrar no grid? ");
        int num = scanner.nextInt();

        for (Integer[] el : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (num == el[j]) {
                    res = el[j];

                }
            }

        }

        if(res != 0){
            resul = "Numero " + res + " encontrado no grid";

        }else{
            resul = "Numero " + num + " não encontrado no grid";
        }

        System.out.println(resul);

    }
}
