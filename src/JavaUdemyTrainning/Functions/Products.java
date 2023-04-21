package JavaUdemyTrainning.Functions;

import java.util.Locale;

public class Products{

    public static void main(String[] args) {
        String productOne = "Computer";
        String productTwo = "office Desk";

        int age =  30;
        int code = 5290;
        char gender = 'F';

        double priceOne = 2100.0;
        double priceTwo = 650.50;
        double measure = 53.234567;


        System.out.println("Products:");
        System.out.printf("Computer, which price is $ %.2f%n", priceOne);
        System.out.printf("Office desk, which price is $ %.2f%n ", priceTwo);
        System.out.println("Record: "+ age + " years old, code "+ code + " and gender: "+ gender + "\n");
        System.out.printf("Measure with Eight decimal places: "+ "%.8f%n", measure);
        System.out.printf("Rounded (three decimal places): " + "%.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf( "US decimal point: " + "%.3f", measure);


    }

}