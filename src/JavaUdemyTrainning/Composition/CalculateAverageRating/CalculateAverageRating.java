package JavaUdemyTrainning.Composition.CalculateAverageRating;

import java.util.List;

/**
 * Challenge: Implement a function to calculate the average rating of a list of products.
 * Description: Given a list of products, each with a name and rating,
 * write a function that calculates the average rating of all the products.
 *
 * Example: calculateAverageRating([{name: 'Product 1', rating: 4},
 *                                  {name: 'Product 2', rating: 5},
 *                                  {name: 'Product 3', rating: 3}])
 *                                  should return 4.
 * */
public class CalculateAverageRating {

    public CalculateAverageRating(){}

    public Integer calcAvgRating(List<Product> productList){
        Integer sum = 0;
        int result = 0;

        for (Product el: productList) {
            sum += el.getProductRating();
            result =  sum / productList.size();
        }

        return result;
    }


}
