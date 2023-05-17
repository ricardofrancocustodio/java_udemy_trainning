package JavaUdemyTrainning.ForEach;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {

        String [] arr = {"Maria", "Joao", "Jose", "Carla"};
        List<String> names = Arrays.asList(arr);
        StringBuilder sb = new StringBuilder();

            for(String nome : arr){
                System.out.println(nome);
                nome.chars().distinct().mapToObj(i ->(char) i).forEach(sb::append);
            }

            System.out.println("-----------------");

            names.forEach(System.out::println);
            System.out.println("-----------------");

            //print element with string Joao
            names.stream().filter(i -> i == "Joao").forEach(System.out::println);


    }

}
