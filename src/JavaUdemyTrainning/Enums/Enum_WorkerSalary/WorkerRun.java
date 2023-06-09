package JavaUdemyTrainning.Enums.Enum_WorkerSalary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WorkerRun {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        double valuePerHour;
        int duration;

            System.out.print("Enter department's name: ");
            String departmentName = scanner.nextLine();
            System.out.println("Now, enter worker data");
            System.out.print("Name: ");
            String name =  scanner.nextLine();
            System.out.print("Level: ");
            String level =  scanner.next();
            System.out.print("Base Salary: ");
            Double baseSalary =  scanner.nextDouble();

            Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

            System.out.print("How many contracts to this worker? ");
            int contracts = scanner.nextInt();

                for(int i=1; i<=contracts; i++){
                    System.out.print("Enter contract #"+i+" data (dd/mm/yyyy):");
                    Date dateContract = simpleDateFormat.parse(scanner.next());

                    System.out.print("Value per hour: ");
                    valuePerHour = scanner.nextDouble();

                    System.out.print("Duration (in hours): ");
                    duration = scanner.nextInt();

                    HourContract hourContract = new HourContract(dateContract,valuePerHour, duration);
                    worker.addContract(hourContract);

                }

                    System.out.println("Enter month and year to calculate income : ");
                    System.out.print("Month : ");
                    int month = scanner.nextInt();
                    System.out.print("Year : ");
                    int year = scanner.nextInt();

                    System.out.println("----------------------");
                    System.out.println("Name: " + worker.get_name());
                    System.out.println("Department: " + worker.get_department().get_name());
                    System.out.println("Worker Level: " + worker.get_workerLevel().name());
                    System.out.println("Base salary: " + worker.get_baseSalary());
                    System.out.println("Income for " + month + "/"+ year + ": " + worker.income(month, year) );

        scanner.close();

    }

}
