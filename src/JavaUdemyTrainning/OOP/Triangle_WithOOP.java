package JavaUdemyTrainning.OOP;

import java.util.Locale;
import java.util.Scanner;

public class Triangle_WithOOP {

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

            double areaX =  calcArea(a, b, c);
            double areaY =  calcArea(d, e, f);

                System.out.printf("Area of triangle X: %.4f%n", areaX);
                System.out.printf("Area of triangle Y: %.4f%n", areaY);

            String result = largerArea(areaX, areaY);
            System.out.println(result);


        scanner.close();

    }

    static double calcArea(double a, double b, double c){

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

    static String largerArea(double a, double b){
        String res = "";

            if(a > b){
                res = "Larger area: X";

            }else{
                res = "Larger area: Y";
            }

                return res;
    }
}
