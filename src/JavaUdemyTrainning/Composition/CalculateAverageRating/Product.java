package JavaUdemyTrainning.Composition.CalculateAverageRating;

import java.util.ArrayList;
import java.util.List;

public class Product {

        private String productName;
        protected Integer productRating;
        List<Product> productList = new ArrayList<>();

        public Product(){}

        public Product(String productName, Integer productRating){
            this.productName = productName;
            this.productRating = productRating;
        }

        public String getProductName() {
            return productName;
        }

        public Integer getProductRating() {
            return productRating;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setProductRating(Integer productRating) {
            this.productRating = productRating;
        }

        public void addproductToList(Product product){
            productList.add(product);
        }



    }

