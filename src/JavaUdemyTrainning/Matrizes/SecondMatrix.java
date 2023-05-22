package JavaUdemyTrainning.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas? ");
        int linhasM = scanner.nextInt();

        System.out.print("Quantas colunas? ");
            int colunasN  = scanner.nextInt();

            System.out.println("Insira os números ");
            int[][] matrix = new int[linhasM][colunasN];

            for(int i=0; i<linhasM; i++){
                for(int j=0; j< colunasN; j++){
                    matrix[i][j] = scanner.nextInt();
                }
            }

            for (int[] el : matrix){
                System.out.println(Arrays.toString(el));
            }
        System.out.println("-----------------------------");
        System.out.print("Insira o número para verificar a ocorrência: ");
        int x =  scanner.nextInt();

        for(int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                if(matrix[i][j] == x){
                    System.out.println("O numero " + matrix[i][j] + " está na posição " + i + ", " + j);

                    if(j > 0){
                        System.out.println("num à esq: "+ matrix[i][j-1]);
                    }

                    if(i > 0){
                        System.out.println("num acima: "+ matrix[i-1][j]);
                    }

                    if(j < matrix[i].length -1){
                        System.out.println("num à dir: "+ matrix[i][j+1]);
                    }

                    if(i < matrix[j].length){
                        System.out.println("num abaixo: "+ matrix[i+1][j]);
                    }

                }
            }

        }

        scanner.close();
    }
}
