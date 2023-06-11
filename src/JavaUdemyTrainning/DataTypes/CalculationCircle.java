package JavaUdemyTrainning.DataTypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Data Types:
 * Exercise 1: Write a program to calculate the area and circumference
 * of a circle given its radius.
 * Take the input from the user and display the results.
 *
 * */
public class CalculationCircle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


            System.out.print("What is the radius of the circle: ");
            double circleRadius = scanner.nextDouble();
            Circle circle = new Circle(circleRadius);

            System.out.println("---------------");
            System.out.println("Area: " + circle.getArea());
            System.out.printf("Circumference: %.2f" , circle.getCircumference());


        scanner.close();
    }
}
