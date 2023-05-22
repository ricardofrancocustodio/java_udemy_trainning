package JavaUdemyTrainning.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMatrix {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

            System.out.print("Qual o numero: ");
            int num = scanner.nextInt();

            int [][] arrBiDimensional =  new int[num][num];

            /**
             * [5][7][11]
             * [8][15][2]
             * [7][9][4]
             * */

            int count = 0;
            //coluna
            for (int i=0; i<num; i++){
                //linha
                for (int j=0; j<num; j++){
                    arrBiDimensional[i][j] = scanner.nextInt();
                    if(arrBiDimensional[i][j] < 0){
                        count++;
                    }
                }

            }


            for(int[] el : arrBiDimensional){
                System.out.println(Arrays.toString(el));
                }
        System.out.println("--------------------------------");
        System.out.println("Negative numbers: " + count);

        System.out.println("--------------------------------");
        System.out.println("Main diagonal numbers: ");
        for(int i=0; i<num; i++){
            System.out.println(arrBiDimensional[i][i]);
        }

        System.out.println("--------------------------------");
        System.out.println(Arrays.deepToString(arrBiDimensional));

        scanner.close();
    }


}
