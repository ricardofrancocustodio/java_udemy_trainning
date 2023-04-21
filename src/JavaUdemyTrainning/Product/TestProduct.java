package JavaUdemyTrainning.Product;

import java.util.Locale;
import java.util.Scanner;
import  JavaUdemyTrainning.Product.Product;

public class TestProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.println("Name: ");
        String prodName = scanner.next();

        System.out.println("Price: ");
        double prodPrice = scanner.nextDouble();

        System.out.println("Qty in stock: ");
        int prodQty = scanner.nextInt();
        System.out.println("Product data: " + prodName + ", Price: $" + prodPrice + ", " + prodQty + " units, " + "Total: $" + product.totalValueInStock(prodPrice, prodQty));

        System.out.println("Enter the number of products to be added in stock: ");
        int addProdQty = scanner.nextInt();
        int tot = product.addProducts(prodQty, addProdQty);
        System.out.println("Updated data: " + prodName + ", " + tot + " units, " + "Total: $" + product.totalValueInStock(prodPrice, tot));

        System.out.println("Enter the number of products to be removed from stock: ");
        int removeProdQty = scanner.nextInt();
        tot = product.removeProducts(tot, removeProdQty);

        System.out.println(product);
        System.out.println("Updated data: " + prodName + ", " + tot + " units, " + "Total: $" + product.totalValueInStock(prodPrice, tot));
    }


}
