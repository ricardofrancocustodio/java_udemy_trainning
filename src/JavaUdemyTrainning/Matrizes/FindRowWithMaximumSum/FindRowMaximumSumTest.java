package JavaUdemyTrainning.Matrizes.FindRowWithMaximumSum;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class FindRowMaximumSumTest extends FindRowMaximumSum {

    @Test
    public void checkMaxOneValuePerRow(){
        int[][] matrix1 = {{1}, {2}};
        List result = rowMaxSum(matrix1);
        Assert.assertEquals("[[1, 2]]", Arrays.toString(new List[]{result}));

    }

    @Test
    public void checkMaxTwoValuesPerRow(){
        int[][] matrix1 = {{1,2}, {3,4}};
        List result = rowMaxSum(matrix1);
        Assert.assertEquals("[[1, 7]]", Arrays.toString(new List[]{result}));

    }

    @Test
    public void checkMaxThreeValuesPerRow(){
        int[][] matrix1 = {{1,2,3}, {4,5,6},{7,8,9}};
        List result = rowMaxSum(matrix1);
        Assert.assertEquals("[[2, 24]]", Arrays.toString(new List[]{result}));

    }


}
