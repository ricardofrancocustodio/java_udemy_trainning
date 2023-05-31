package JavaUdemyTrainning.Vetores;

import java.util.Arrays;
import java.util.HashSet;

public class SmallestPositiveInteger {

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 1, 2};
        //int[] arr = {1, 2, 3};
        System.out.println(solution(arr));

    }


    static int solution(int[] array) {
        // Implement your solution here
        HashSet<Integer> arr = new HashSet<>();

        for (Integer el: array) {
            arr.add(el);
        }

        int smallestPositiveInteger = 1;
        while(arr.contains(smallestPositiveInteger)){
            smallestPositiveInteger++;
        }


        return smallestPositiveInteger;
    }



}

