package JavaUdemyTrainning.Matrizes.FindRowWithMaximumSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Row with Maximum Sum:
 * Write a Java program to find the row with the maximum sum in a given 2D array.
 * Print the sum and the index of the row.
 *
 * */
public class FindRowMaximumSum {

    public List rowMaxSum(int[][] matrix){
        int sum = 0;
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                sum += matrix[i][j];
            }

            nums.add(sum);
            sum = 0;
        }

        int maxValue = 0;
        int pos = 0;

        for(int k=0; k<nums.size(); k++){
            if(nums.get(k) > maxValue){
                maxValue = nums.get(k);
                pos = k;
            }
        }

        result.add(pos);
        result.add(maxValue);

        return result;
    }

}
