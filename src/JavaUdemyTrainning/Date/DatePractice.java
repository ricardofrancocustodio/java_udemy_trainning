package JavaUdemyTrainning.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {

        //Output: 2023-06-05
        LocalDate _localdate = LocalDate.now();
        System.out.println("LocalDate = "+ _localdate);

        //Output: Mon Jun 05 12:42:40 BRT 2023
        Date _date = new Date();
        System.out.println("Date = "+ _date);

        //Output: 2023-06-05T12:42:11.517
        LocalDateTime _localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime = "+ _localDateTime);

        //Output: 2023-06-05T15:45:13.875Z
        Instant _instant = Instant.now();
        System.out.println("Instant = "+ _instant);

        System.out.println("---------");

        DateTimeFormatter _dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter _dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDate _ex01 = LocalDate.parse("05/06/2023", _dateTimeFormatter);
        System.out.println(_ex01.format(_dateTimeFormatter));

        System.out.println("---------");
        LocalDateTime _ex02 = LocalDateTime.parse("2023-06-05T13:07:40");
        System.out.println(_ex02);
        System.out.println(_ex02.getHour());
        System.out.println(_ex02.getMinute());
    }
}
