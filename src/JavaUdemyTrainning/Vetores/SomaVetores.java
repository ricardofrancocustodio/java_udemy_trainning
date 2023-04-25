package JavaUdemyTrainning.Vetores;

import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Quantos valores vão ter cada vetor? ");
        int num = scanner.nextInt();
        int [] vetorA =  new int[num];
        int [] vetorB =  new int[num];

            System.out.println("Digite os valores do vetor A");

            for(int i=0; i<num; i++){
                vetorA[i] = scanner.nextInt();
            }

            System.out.println("Digite os valores do vetor B");

            for(int i=0; i<num; i++){
                vetorB[i] = scanner.nextInt();
            }

            int [] arr =  somaVetores(vetorA, vetorB, num);

            System.out.println("Vetor resultante: ");
                for (int el : arr){
                    System.out.println(el);
                }



    }

    static int [] somaVetores(int [] vetorA, int [] vetorB, int n){
        int [] resultVet = new int[n];

        for(int i=0; i<n; i++){
            resultVet[i] = vetorA[i] + vetorB[i];
        }

        return resultVet;
    }




}
