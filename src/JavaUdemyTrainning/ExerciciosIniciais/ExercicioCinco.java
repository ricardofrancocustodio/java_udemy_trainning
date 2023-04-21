package JavaUdemyTrainning.ExerciciosIniciais;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
 * e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 *
 * */
public class ExercicioCinco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        int codigoPecaUm = scanner.nextInt();
        int qtdPecasUm = scanner.nextInt();
        double valorCadaPecaUm = scanner.nextDouble();

        int codigoPecaDois = scanner.nextInt();
        int qtdPecasDois = scanner.nextInt();
        double valorCadaPecaDois = scanner.nextDouble();

        double result = (qtdPecasUm * valorCadaPecaUm) + (qtdPecasDois * valorCadaPecaDois);

        System.out.printf("VALOR A PAGAR = R$ " + "%.2f", result);


    }
}
