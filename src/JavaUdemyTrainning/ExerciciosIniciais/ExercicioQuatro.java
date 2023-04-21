package JavaUdemyTrainning.ExerciciosIniciais;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, com duas casas  decimais.
 *
 * nota > inserir valores com vírgulas
 *
 * Entrada: 25,100, 5.50  >>  Saída: NUMBER = 25 SALARY = U$ 550.00
 * Entrada: 1, 100, 20.50  >>  Saída: NUMBER = 1 SALARY = U$ 4100.00
 * Entrada: 6, 145, 15.55  >>  Saída: NUMBER = = 6 SALARY = U$ 2254.75
 *
 * */
public class ExercicioQuatro {

    public static void main(String[] args) {
        //chama antes de receber os dados
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

            int numFuncionario = scanner.nextInt();
            double horasTrabalhadas = scanner.nextDouble();
            double valorRecebidoPorHora = scanner.nextDouble();
            double salary = valorRecebidoPorHora * horasTrabalhadas;

                System.out.println("NUMBER = " + numFuncionario);
                System.out.printf("SALARY = US$ "+ "%.2f", salary);

        scanner.close();

    }
}
