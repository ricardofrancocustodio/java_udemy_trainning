package JavaUdemyTrainning.ExerciciosIniciais;

import java.util.Locale;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar
 * o valor da área deste círculo com quatro casas decimais conforme exemplos.
 * Fórmula da área: area = π . raio2
 * Considere o valor de π = 3.14159
* */
public class ExercicioDois {

    public static void main(String[] args) {
        double raio = 100.64; //2.00, 100.64, 150.00
        double area = 3.14159 * (raio*raio);

        System.out.println(area);

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f", area);

    }
}
