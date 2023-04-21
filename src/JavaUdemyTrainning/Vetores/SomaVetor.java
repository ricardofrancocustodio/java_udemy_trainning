package JavaUdemyTrainning.Vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        ArrayList<Double> arrayList =  new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n =  scanner.nextInt();

            for(int i=1; i<=n; i++){
                System.out.print("Digite o "+ n + "º número: ");
                double num = scanner.nextDouble();

                arrayList.add(num);
            }

            System.out.println("Valores digitados = " + arrayList);
            System.out.println("A Soma desses valores é igual a " + arrayList.stream().mapToDouble(i -> i).sum());
            System.out.println("A média desses valores é igual a " + arrayList.stream().mapToDouble(i -> i).average());

    }


}
