package questions.stringmanipulating;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintInitials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create a list and add the names which came from user
        List<String> names = new ArrayList<>();
        int i = 0;
        do {
            System.out.println("Enter a full name");
            names.add(scanner.nextLine());
            i++;
        } while (i < 5);
        System.out.println(names);

        //Create a list for initials
        List<String> initials = new ArrayList<>();

        for (String x : names) {
            initials.add(x.substring(0, 1) + x.charAt(x.indexOf(" ") + 1));
        }
        System.out.println(initials);
    }
}
