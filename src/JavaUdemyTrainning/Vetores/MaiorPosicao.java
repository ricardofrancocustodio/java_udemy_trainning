package JavaUdemyTrainning.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        //double [] array = {1.0, 2.0, 10.0};
        System.out.print("Quantos numeros você vai digitar? ");
        int n = scanner.nextInt();

        Double [] numeros = new Double[n + 1];

        for(int i=0; i<n; i++){
            System.out.print("Digite o " + (i+1) +"º numero: ");
            double num = scanner.nextDouble();
            numeros[i] = num;
            numeros[n] = numeros[i];

        }

            System.out.println("Menor valor: " + lowestPos(numeros));
            System.out.println("Maior valor: " + highestPos(numeros));
            System.out.println("Posição (index) do maior valor: " + highValPos(numeros));

        scanner.close();
    }


    static Double highestPos(Double [] array){
        Double maxVal = array[0];

            for(int i=1; i < array.length; i++){
                if(array[i] > maxVal){
                    maxVal = array[i];
                }
            }

        return maxVal;
    }

    static Double lowestPos(Double [] array){
        Double maxVal = array[0];

        for(int i=1; i < array.length; i++){
            if(array[i] < maxVal){
                maxVal = array[i];
            }
        }

        return maxVal;
    }

    static int highValPos(Double [] array) {
        Double maxVal = array[0];
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
                pos = i;

            }
        }

        return pos;
    }



}
