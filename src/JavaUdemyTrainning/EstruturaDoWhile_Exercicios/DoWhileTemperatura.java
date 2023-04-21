package JavaUdemyTrainning.EstruturaDoWhile_Exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Temperaturas:
 * Entrada: 30.0 | 21.0 | -13.5
 *
 * */

public class DoWhileTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        char res = '\u0000';

            do {
                System.out.print("Digite a temperatura em Celsius:");
                double tc = scanner.nextDouble();
                double fh = (9.0 * tc / 5) + 32.0;

                System.out.printf("Equivalente em Fahrenheit: %.1f%n" , fh);

                System.out.println("Deseja repetir? (s/n) ");
                res = scanner.next().charAt(0);

                }while (res == 's');

        scanner.close();

    }
}
