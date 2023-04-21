package JavaUdemyTrainning.OOP.Employee;

import java.util.Locale;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Employee employee = new Employee();
        Scanner scanner =  new Scanner(System.in);

        System.out.printf("Name: ");
        employee.setName(scanner.nextLine());
        System.out.printf("Gross Salary: ");
        employee.setGrossSalary(scanner.nextDouble());
        System.out.printf("Tax: ");
        employee.setTax(scanner.nextDouble());
        System.out.println(employee);

        System.out.println("What percentage to increase salary?");
        employee.increaseSalary(scanner.nextDouble());
        //System.out.println("Updated data: " + (employee.updatedSalary()));
        System.out.println("Updated data: " + (employee));

    }
}
