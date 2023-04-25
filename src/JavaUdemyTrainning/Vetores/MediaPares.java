package JavaUdemyTrainning.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

            System.out.print("Quantos elementos vão ter o vetor? ");
            int n = scanner.nextInt();
            double [] elementos = new double[n];

            for(int i=0; i<n; i++){
                System.out.print("Digite um numero: ");
                elementos[i] += scanner.nextDouble();
            }

            if(mediaAritmetica(elementos) == 0.0){
                System.out.println("nenhum numero par foi digitado.");
            }else{
                System.out.printf("Media dos Pares: %.1f" ,  mediaAritmetica(elementos));
            }


        scanner.close();

    }


    static double mediaAritmetica(double[] numero){
        double res = 0.0;

            for (int i=0; i<numero.length; i++){
                if(numero[i] % 2 == 0){
                    System.out.println(numero[i]);
                    res += numero[i];
                }
            }

        return res /numero.length ;
    }

}
