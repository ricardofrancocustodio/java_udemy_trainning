package JavaUdemyTrainning.Composition.CalculateTotalPriceShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String productName;
    private Double productPrice;
    List<Product> productList = new ArrayList<>();

    public Product(){}

    public Product(String productName, Double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void addProductToCart(Product product){
        productList.add(product);
    }

    public Double totalValueShoppingCart(){
        Double sum = 0.0;
        for (Product el : productList) {
            sum += el.getProductPrice();
        }

        return sum;
    }

}
