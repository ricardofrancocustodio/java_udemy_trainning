package JavaUdemyTrainning.Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdElem = scanner.nextInt();
        double [] notas = new double[qtdElem];

        for(int i=0; i<qtdElem; i++){
            System.out.print("Digite um numero: ");
            double num = scanner.nextDouble();

            notas[i] += num;
        }

        System.out.print("Media do vetor: ");
        System.out.println(mediaDoVetor(notas));

        System.out.println("Elementos abaixo da media: " );

        for(double el: abaixoDaMedia(notas)){
            System.out.println(el);
        }

    }


    static double mediaDoVetor(double [] array){
        double res = 0.0;

        for(int i=0; i<array.length; i++){
            res += array[i];
        }

        return res / array.length;
    }

    static double [] abaixoDaMedia(double [] array){
        double [] resultElem = new double[array.length];

        for(int i=0; i<array.length; i++){
           if(array[i] < mediaDoVetor(array)){
               resultElem[i] += array[i];
           }
        }

        //retornando array com os resultados corretos, mas com os 0.0 incluidos
        return resultElem;

    }

}
