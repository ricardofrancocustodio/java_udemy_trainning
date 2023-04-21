package JavaUdemyTrainning.OOP.TriangleOOP;

import java.util.Locale;
import java.util.Scanner;

/**
 * Entrada Triangulo X: 3.00 | 4.00 | 5.00 |
 * Entrada Triangulo Y: 7.50 | 4.50 | 4.02 |
 *
 * */
public class TestTriangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);
        Triangle triangle =  new Triangle();
        Triangle triangleX =  new Triangle();
        Triangle triangleY =  new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.a = scanner.nextDouble();
        triangleX.b = scanner.nextDouble();
        triangleX.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.a = scanner.nextDouble();
        triangleY.b = scanner.nextDouble();
        triangleY.c = scanner.nextDouble();

        //double areaX = triangleX.area(triangleX.a, triangleX.b, triangleX.c);
        //double areaY = triangleY.area(triangleY.a, triangleY.b, triangleY.c);

        double areaX = triangle.area();
        double areaY = triangle.area();

         String largerArea = triangle.largerArea(areaX, areaY);

            System.out.printf("Area of triangle X: %.4f%n", areaX);
            System.out.printf("Area of triangle Y: %.4f%n", areaY);
            System.out.println(largerArea);

    }
}
