package JavaUdemyTrainning.Composition.CalculateTotalPriceShoppingCart;

import JavaUdemyTrainning.Composition.CalculateAverageRating.CalculateAverageRating;
import JavaUdemyTrainning.Composition.CalculateAverageRating.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateTotalPriceShoppingCartRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("How many products do you want to rate? ");
        int productsToRate = scanner.nextInt();

        for(int i=0; i < productsToRate; i++){
            System.out.println("Enter the name of the " +(i+1) + " product:");
            String productName = scanner.next();

            System.out.println("Enter the rating for the " +(i+1) + " product:");
            Integer rating = scanner.nextInt();

            Product productToAdd = new Product(productName, rating);
            productList.add(productToAdd);

        }

        CalculateAverageRating car = new CalculateAverageRating();
        System.out.println("-------------------------");
        System.out.println("The average is " + car.calcAvgRating(productList));

        scanner.close();
    }

}
