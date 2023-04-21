package JavaUdemyTrainning.Vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemaNegativos {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> neg =  new ArrayList<>();
        ArrayList<Integer> pos =  new ArrayList<>();
        Scanner scanner =  new Scanner(System.in);

            System.out.print("Quantos numeros voce vai digitar? ");
            int n = scanner.nextInt();

                for(int i=1; i<=n; i++){
                    System.out.print("Digite um número: ");
                    int num = scanner.nextInt();

                    list.add(num);
                }

                list.stream().forEach(i -> (i<0 ? neg : pos).add(i));

                System.out.println("Positivos: " + pos + "\n" +
                                    "Negativos: " + neg);

        scanner.close();
    }


}
