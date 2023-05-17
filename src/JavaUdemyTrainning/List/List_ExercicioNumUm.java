package JavaUdemyTrainning.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class List_ExercicioNumUm {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner             = new Scanner(System.in);
        double percentage = 0;

        List<String> nomeFunc       = new ArrayList<>();
        List<Double> salarioFunc    = new ArrayList<>();
        List<Integer> idFunc        = new ArrayList<>();

            System.out.print("Quantos funcionarios quer cadastrar: ");
            int qtdFunc = scanner.nextInt();

            for(int i=0; i< qtdFunc; i++){
                System.out.println("Employee #" + (i+1));

                System.out.print("Qual o ID? ");
                int id = scanner.nextInt();
                idFunc.add(id);

                System.out.print("Qual o Nome? ");
                String nome = scanner.next();
                nomeFunc.add(nome);

                System.out.print("Qual o Salario? ");
                double salario = scanner.nextDouble();
                salarioFunc.add(salario);

            }

            System.out.print("Enter the employee ID that will have the salary increased: ");
            int idToBeIncreased = scanner.nextInt();

        Integer employee =  idFunc.stream().filter(i -> i == idToBeIncreased).findFirst().orElse(null);

        if(employee == null){
            System.out.println("Esse Id não existe.");
            System.exit(0);

        }else{
            System.out.print("Enter the the percentage: ");
             percentage = scanner.nextDouble();

        }


            System.out.println("List of Employees: ");

                for(int i=0; i<idFunc.size(); i++){
                    if (idFunc.get(i) == idToBeIncreased){
                        System.out.println(idFunc.get(i) +", "+ nomeFunc.get(i) + ", "+ ( salarioFunc.get(i) + (salarioFunc.get(i) /100) * percentage) );

                    }else{
                        System.out.println(idFunc.get(i) +", "+ nomeFunc.get(i) + ", "+ salarioFunc.get(i) );
                    }
                }

        scanner.close();
    }


}
