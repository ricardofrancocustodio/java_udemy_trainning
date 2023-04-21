package JavaUdemyTrainning.ExerciciosIniciais;

import java.util.Scanner;

/**
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule
 * e mostre a diferença do produto  * de A e B pelo produto de C e D
 * segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * //Entrada: 5, 6, 7, 8   Saída: DIFERENCA = -26
 * //Entrada: 5, 6, -7, 8  Saída: DIFERENCA = 86
 *
 * */
public class ExercicioTres {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int diferenca = 0;

            diferenca = (a * b - c * d);

            System.out.println("DIFERENCA = " + diferenca);

        scanner.close();

    }
}
