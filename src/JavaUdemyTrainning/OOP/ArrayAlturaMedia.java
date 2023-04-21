package JavaUdemyTrainning.OOP;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayAlturaMedia {

       public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        ArrayList average = new ArrayList();
        Scanner scanner =  new Scanner(System.in);

           System.out.print("Enter number of heights to calculate: ");
           int n = scanner.nextInt();

           double[] vet = new double[n];
           double sum = 0.0;

            for(int i = 0; i < n; i++){
                System.out.print("Height " + i + ": ");
           //     average.add(scanner.nextDouble());
                vet[i] += scanner.nextDouble();

            }

            for(int y = 0; y < n; y++){
               sum  += vet[y];

            }

           System.out.printf("Average height: %.2f" ,  sum / n);


           // average.stream().mapToDouble(num -> ((double) num)).average().orElse(0.0));

    }
}
