package JavaUdemyTrainning.ExerciciosIniciais;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 * mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 *
 * */
public class ExercicioSeis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double areaDoTriangulo = (a * c) / 2;
        double areaDoCirculoDeRaio =  3.14159 * (c * c);
        double areaDoTrapezio = ((a + b) / 2) * c;
        double areaDoQuadrado = b * b;
        double areaDoRetangulo = a * b;

        System.out.printf("TRIANGULO: " + "%.3f%n", areaDoTriangulo);
        System.out.printf("CIRCULO: " + "%.3f%n", areaDoCirculoDeRaio);
        System.out.printf("TRAPEZIO: " + "%.3f%n", areaDoTrapezio);
        System.out.printf("QUADRADO: " + "%.3f%n", areaDoQuadrado);
        System.out.printf("RETANGULO: " + "%.3f", areaDoRetangulo);

    }

}
