package arraysmultidementionalarrays;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date1 {
    public static void main(String[] args) {
        //We don't use new keyword becasue now method has it.

        LocalDate currenDate = LocalDate.now();
        System.out.println(currenDate);//2022-01-16
        //plusDays to add days to current day
        System.out.println(currenDate.plusDays(5));//2022-01-21
        //plusMonths
        System.out.println(currenDate.plusMonths(6));//2022-07-16
        //plusYears()
        System.out.println(currenDate.plusYears(2));//2024-01-16
        System.out.println(currenDate.plusDays(3).plusMonths(2).plusYears(2));//2024-03-19
        //getYear
        System.out.println(currenDate.getYear());//2022
        //getMonths
        System.out.println(currenDate.getMonth());//JANUARY
        System.out.println(currenDate.getMonthValue());//1
        System.out.println(currenDate.getDayOfMonth());//16
        System.out.println(currenDate.getDayOfYear());//16
        System.out.println(currenDate.getDayOfWeek());//Sunday
        System.out.println(currenDate.minusDays(2));//2022-01-14
        System.out.println(currenDate.minusMonths(2));//2021-11-16

        LocalDate localDate = LocalDate.of(2018, 05, 25);
        System.out.println(currenDate.isAfter(localDate));//true
        System.out.println(currenDate.isBefore(localDate));//false

        System.out.println(currenDate.isLeapYear());//false

        //How to create time object
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//19:32:29.648435500
        System.out.println(currentTime.plusMinutes(10));//19:44:07.167925800

        System.out.println(currentTime.now(ZoneId.of("Japan")));//09:40:24.447807500
        System.out.println(currentTime.now(ZoneId.of("Turkey")));//03:41:10.617638

        //How to create an object from LocalDateTime
        LocalDateTime dateTime =  LocalDateTime.now();
        System.out.println(dateTime);//2022-01-16T19:42:21.646145900

        LocalDate currentDate2 = LocalDate.now();
        System.out.println(currentDate2);//2022-01-16

        DateTimeFormatter dtfrmtr= DateTimeFormatter.ofPattern("YY/MM/DD");
                                                                //M==>Months, m==>minutes
                                                                //MMM==> First 3 charters of the month
                                                                // MM==> number of the mont
                                                                //MMMM==> Full months name
        System.out.println(dtfrmtr.format(currentDate2));//22/Jan/16

        LocalTime currentTime2 = LocalTime.now();
        DateTimeFormatter dtfr = DateTimeFormatter.ofPattern("hh:mm"); //hh is for am pm format //HH is for 24 hours
        System.out.println(dtfr.format(currentTime2));

        //how to find diffrence between two dates
        LocalDate ld1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1997, 5,30);
        Period age = Period.between(d2, ld1);
        System.out.println(age);//P24Y7M17D
        int ageYear = Period.between(d2, ld1).getYears();
        System.out.println(ageYear);//24

    }
}
