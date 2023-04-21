package JavaUdemyTrainning.OOP;

import java.util.Locale;
import java.util.Scanner;

public class Triangle_NoOOP {

    /**
     * Entrada Triangulo X: 3.00 | 4.00 | 5.00 |
     * Entrada Triangulo Y: 7.50 | 4.50 | 4.02 |
     *
     * */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

            System.out.println("Enter the measures of triangle X: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            System.out.println("Enter the measures of triangle Y: ");
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();

            double pX = (a + b + c) / 2;
            double pY = (d + e + f) / 2;

            double areaX = Math.sqrt(pX * (pX - a) * (pX - b) * (pX - c));
            double areaY = Math.sqrt(pY * (pY - d) * (pY - e) * (pY - f));

                System.out.printf("Area of triangle X: %.4f%n", areaX);
                System.out.printf("Area of triangle Y: %.4f%n", areaY);

                    if(areaX > areaY){
                        System.out.println("Larger area: X");

                    }else{
                        System.out.println("Larger area: Y");
                    }

        scanner.close();
    }
}
