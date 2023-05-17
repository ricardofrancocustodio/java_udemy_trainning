package JavaUdemyTrainning.List.ListOOP;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Test_ListEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner                         = new Scanner(System.in);
        ListEmployee listEmployee               = new ListEmployee();
        ArrayList<Integer> listEmployeeId       = new ArrayList<>();
        ArrayList<String> listEmployeeNome      = new ArrayList<>();
        ArrayList<Double> listEmployeeSalario   = new ArrayList<>();
        Double percentage = 0.0;


        System.out.print("Quantos funcionarios quer cadastrar: ");
        int qtdFunc = scanner.nextInt();

        for(int i=0; i< qtdFunc; i++){
            System.out.println("Employee #" + (i+1));

            System.out.print("Qual o ID? ");
            int id = scanner.nextInt();

            System.out.print("Qual o Nome? ");
            String nome = scanner.next();

            System.out.print("Qual o Salario? ");
            double salario = scanner.nextDouble();

            listEmployeeId.add(id);
            listEmployeeNome.add(nome);
            listEmployeeSalario.add(salario);
        }

        System.out.print("Enter the employee ID that will have the salary increased: ");
        int idToBeIncreased = scanner.nextInt();

        Integer employee = listEmployee.getIdToIncreaseSalary(listEmployeeId, idToBeIncreased);

        if(employee == null){
            System.out.println("Esse Id não existe.");
            System.exit(0);

        }else{
            System.out.print("Enter the the percentage: ");
            percentage = scanner.nextDouble();

        }

        for(int i=0; i < qtdFunc; i++){
            if(listEmployeeId.get(i) == idToBeIncreased){
               Double raise = listEmployee.salaryRaise(listEmployeeSalario.get(i), percentage);
               listEmployeeSalario.set(i, raise);

            }
        }

        ListEmployee listEmployeeArr = new ListEmployee(listEmployeeId, listEmployeeNome, listEmployeeSalario);
        System.out.println(listEmployeeArr);

        for(int i=0; i<qtdFunc; i++){
            System.out.println("ListEmployees{Id=[" + listEmployeeId.get(i)+ "], Nome=[" + listEmployeeNome.get(i) + "], Salario=[" + listEmployeeSalario.get(i) +"]");

        }

        scanner.close();
    }



}
