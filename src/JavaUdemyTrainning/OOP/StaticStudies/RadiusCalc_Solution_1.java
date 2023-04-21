package JavaUdemyTrainning.OOP.StaticStudies;

import java.util.Locale;
import java.util.Scanner;

public class RadiusCalc_Solution_1 {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference = circumference(radius);
        double volume = volume(radius);

        System.out.printf("circumference: %.2f%n", circumference);
        System.out.printf("volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f", PI);

        scanner.close();
    }


    public static double circumference(double radius){
        return 2.0 * PI * radius;

    }

    public static double volume(double radius){
        return 4.0 * PI * (radius * radius * radius) / 3.0;
    }

}
