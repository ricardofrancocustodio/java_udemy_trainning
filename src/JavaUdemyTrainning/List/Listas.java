package JavaUdemyTrainning.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> namesWithA = new ArrayList<>();

        names.add("Maria");
        names.add("Anita");
        names.add("Alex");
        names.add("Bob");
        names.add("Anna");
        names.add(2, "Marco");

        System.out.println(names);
        System.out.println("---------");
        System.out.println(names.size());
        System.out.println("---------");

        for (String el : names){
            System.out.println(el);
        }
        System.out.println("---------");
        names.removeIf((i -> i.charAt(0) == 'M'));
        System.out.println(names);
        System.out.println("---------");
        names.removeIf(i -> i.equals("Anna"));
        System.out.println(names);
        System.out.println("---------");
        System.out.println("Index of Bob is " + names.indexOf("Bob"));
        System.out.println("---------");

        List<String> res = names.stream().filter(i -> i.charAt(0)== 'A').collect(Collectors.toList());
        System.out.println(res);


    }
}
