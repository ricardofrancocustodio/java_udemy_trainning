package JavaUdemyTrainning.OOP.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width and height:");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());

        System.out.println("Area is: " + rectangle.area());
        System.out.println("Perimeter is: " + rectangle.perimeter());
        System.out.println("Diagonal is: " + rectangle.diagonal());


    }
}
