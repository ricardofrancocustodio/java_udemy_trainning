package JavaUdemyTrainning.Matrizes.FindRowWithMaximumSum;

public class FindRowMaximumSumRun {

    public static void main(String[] args) {

        FindRowMaximumSum findRowMaximumSum  =  new FindRowMaximumSum();

        //int[][] matrix1 = {{1}, {2}};
        //int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        System.out.println(findRowMaximumSum.rowMaxSum(matrix1));


    }
}
