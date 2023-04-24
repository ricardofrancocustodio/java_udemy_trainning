package JavaUdemyTrainning.Vetores;

import javafx.util.converter.LocalDateStringConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = scanner.nextInt();

        String [] name = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];
        double somaMediaAltura = 0.0;
        float percentageLessSixteen = 0f;

            for(int i=0;i<n; i++){

                System.out.println("Dados da " + (i+1) + "ª pessoa: ");
                System.out.print("Nome: ");
                name[i]  = scanner.next();
                System.out.print("Idade: ");
                idade[i] = scanner.nextInt();
                System.out.print("Altura: ");
                altura[i] = scanner.nextDouble();

            }

            for(int i=0; i<altura.length; i++){
                somaMediaAltura += altura[i];
            }


        System.out.printf("Altura média: %.2f\n",  somaMediaAltura / n);
        //System.out.println("Altura média: " + Arrays.stream(altura).average());


        int count = 0;

        for(int i=0; i<idade.length; i++){
            if(idade[i] < 16) {
                count++;

            }
        }

        percentageLessSixteen = ((float)count /n)  * 100f;

        System.out.println("Pessoas com menos de 16 anos: " + count + ", o que representa " + percentageLessSixteen + " % do total.");

        System.out.println("Os menores de 10 anos são: ");

        //Onde está o vínculo do nome com a idade??
        for(int i=0; i<idade.length; i++){
            if(idade[i] < 16) {
                System.out.println(name[i]);

            }
        }


        scanner.close();

    }


}
