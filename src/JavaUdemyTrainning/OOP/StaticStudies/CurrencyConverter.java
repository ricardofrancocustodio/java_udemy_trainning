package JavaUdemyTrainning.OOP.StaticStudies;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPriceINBRL = scanner.nextDouble();
        System.out.println("How manu dollars will be bought? ");
        double amountDollar = scanner.nextDouble();
        System.out.printf("Amount to be paid in Reais:%.2f " , convertUSDToBRL(dollarPriceINBRL, amountDollar));


    }

    static double convertUSDToBRL(double dollarPriceInBRL,double amountDollar ){
        double value = dollarPriceInBRL * amountDollar;

            return ((value/100) * 6) + value;
    }

}
