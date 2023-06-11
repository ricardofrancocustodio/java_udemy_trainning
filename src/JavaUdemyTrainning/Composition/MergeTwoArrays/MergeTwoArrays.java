package JavaUdemyTrainning.Composition.MergeTwoArrays;

import java.util.*;

/**
 * Challenge: Merge two arrays of numbers into a single sorted array.
 * Description: Write a function that takes two arrays of numbers and merges them into a
 * single sorted array.
 * Example: mergeArrays([1, 3, 5], [2, 4, 6]) should return [1, 2, 3, 4, 5, 6].
 *
 * */
public class MergeTwoArrays {

    List<Integer> firstArray;
    List<Integer> secondArray;

    public MergeTwoArrays(List<Integer> arr1, List<Integer> arr2){
        this.firstArray = arr1;
        this.secondArray = arr2;
    }

    public List<Integer> MergeArrays(){
        List<Integer> result = new ArrayList<>(firstArray);
        result.addAll(secondArray);
        Collections.sort(result);

        return result;
    }


}
