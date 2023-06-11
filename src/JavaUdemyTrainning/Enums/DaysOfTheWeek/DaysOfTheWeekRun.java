package JavaUdemyTrainning.Enums.DaysOfTheWeek;

import java.util.Locale;
import java.util.Scanner;

public class DaysOfTheWeekRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek dow = new DaysOfTheWeek();

            System.out.print("Enter the day to show next: ");
            String day = scanner.next().toUpperCase(Locale.ROOT);
            System.out.println("You entered " + day +". The next day is " + dow.getNextDayOfTheWeek(day));

        scanner.close();
    }
}
