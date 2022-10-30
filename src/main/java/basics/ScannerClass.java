package basics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// get data from outside
//        System.out.println("Please enter the first integer :"); // message to user
//        int firstInt = scan.nextInt();
//        System.out.println("Please Second the second integer :");
//        int secondInt = scan.nextInt();
//        System.out.println("Sum of the integers are: " + (firstInt + secondInt));
//        System.out.println("Difference of the integers are: " + (firstInt - secondInt));

        System.out.println("Please enter your first name");
        String firstName= scan.next();
        char firstNameInitial= firstName.charAt(0);

        System.out.println("Please enter your last name");
        String lastName= scan.next();
        char lastNameInitial= lastName.charAt(0);

        System.out.println("Initial of the person is " + (firstNameInitial + "" + lastNameInitial));


    }
}
