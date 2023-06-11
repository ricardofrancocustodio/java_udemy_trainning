package JavaUdemyTrainning.Composition.MergeTwoArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoArraysRun {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> firstArray = new ArrayList<>();
        List<Integer> secondArray = new ArrayList<>();

        System.out.print("Number of positions - first array: ");
        int arr1 = scanner.nextInt();

            for(int i=0; i<arr1; i++){
                int value1 = scanner.nextInt();
                firstArray.add(value1);
            }

        System.out.print("Number of positions - second array: ");
        int arr2 = scanner.nextInt();

        for(int i=0; i<arr2; i++){
            int value2 = scanner.nextInt();
            firstArray.add(value2);
        }

        MergeTwoArrays mergeTwoArrays = new MergeTwoArrays(firstArray, secondArray);
        System.out.println(mergeTwoArrays.MergeArrays());
    }
}
