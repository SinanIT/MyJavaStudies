package HackerRankQuestions.rank;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {
    public static String getDay(String month, String day, String year){
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        LocalDate lt = LocalDate.of(y,m,d);
        return lt.getDayOfWeek().name();

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        String day = scanner.next();
        String year = scanner.next();

        System.out.println(getDay(month, day, year));

    }
}
