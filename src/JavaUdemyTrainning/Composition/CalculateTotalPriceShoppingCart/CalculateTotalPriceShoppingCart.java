package JavaUdemyTrainning.Composition.CalculateTotalPriceShoppingCart;

import java.util.Locale;
import java.util.Scanner;

/**
 * Challenge: Calculate the total price of a shopping cart with multiple items.
 * Description: Given a list of items, each with a name and price, write a function
 * that calculates the total price of the shopping cart.
 * Example: calculateTotalPrice([{name: 'Item 1', price: 10},
 *                               {name: 'Item 2', price: 5},
 *                               {name: 'Item 3', price: 7}])
 *                               should return 22.
 *
 * */
public class CalculateTotalPriceShoppingCart {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

            System.out.print("how many products do you want to register? ");
            int qtdProducts =  scanner.nextInt();

            for (int i=0; i<qtdProducts; i++){
                System.out.println("Enter  product #"+(i+1) );
                System.out.print("Product Name: ");
                String productName = scanner.next();

                System.out.print("Product Price: ");
                Double productPrice = scanner.nextDouble();

                Product productList = new Product(productName, productPrice);
                product.addProductToCart(productList);

            }

            System.out.printf("Total in shopping cart: %.2f ", product.totalValueShoppingCart());








        scanner.close();
    }


}
