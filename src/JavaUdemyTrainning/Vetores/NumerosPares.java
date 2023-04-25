package JavaUdemyTrainning.Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n;

        System.out.printf("Quantos numeros você vai digitar? ");
        n = scanner.nextInt();
        int [] listNum = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite o " + (i+1) + "º numero: " );
            int num = scanner.nextInt();

            listNum[i] += num;
        }

        System.out.printf("Numeros pares: " + Arrays.toString(numerosPares(listNum)));
        System.out.println("Numeros pares: " + Arrays.toString(numerosImpares(listNum)));

    }

    //RETURNING ZERO VALUES ON ARRAY. WHY?
    static int [] numerosImpares(int [] array){
        int [] impares = new int[array.length];

            for(int i=0; i<array.length; i++){
                if(array[i] % 2 != 0){
                    impares[i] += array[i];
                }
            }

        return impares;
    }

    //RETURNING ZERO VALUES ON ARRAY. WHY?
    static int [] numerosPares(int [] array){
        int [] pares = new int[array.length];

        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                pares[i] += array[i];
            }
        }

        return pares;

    }

}
