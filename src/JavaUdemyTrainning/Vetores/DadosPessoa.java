package JavaUdemyTrainning.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n =  scanner.nextInt();

        double [] alturas = new double[n];
        String [] generos =  new String[n];

        for(int i=0; i<n; i++){
            System.out.print("Altura da " + (i+1) + "ª pessoa:");
            double alt = scanner.nextDouble();
            System.out.print("Genero da " + (i+1) + "ª pessoa:");
            String gen = scanner.next();

            alturas[i] += alt;
            generos[i] += gen;
        }

        for(double el : alturas){
            System.out.println(el);
        }

        for(String el : generos){
            System.out.println(el);
        }

        System.out.println("Menor altura = " + menorAltura(alturas));
        System.out.println("Menor altura = " + maiorAltura(alturas));
        System.out.println("Media de altura das mulheres = " + mediaAlturaMulheres(generos, alturas));
        System.out.println("Numero de Homens = " + numeroDeHomens(generos));

    }


    static double menorAltura(double [] alturas){
        double firstPos = alturas[0];

        for(double el: alturas){
            if(el < firstPos){
                firstPos = el;
            }
        }

        return firstPos;
    }

    static double maiorAltura(double [] alturas){
        double firstPos = alturas[0];

        for(double el: alturas){
            if(el > firstPos){
                firstPos = el;
            }
        }

        return firstPos;

    }

    static double mediaAlturaMulheres(String [] genero, double [] alturas){
        double [] alturasFem = new double[genero.length];
        double alturaF = 0.0;

        for(int i=0; i<alturas.length; i++){
            if(genero[i].equals("F")){
                alturaF += alturas[i];
            }
        }

            return alturaF / alturasFem.length;
    }

    static int numeroDeHomens(String [] genero){
        int res = 0;

        for(int i=0; i<genero.length; i++){
            if(genero[i].equals("M")){
                res++;
            }
        }

        return res;
    }


}
