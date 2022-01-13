package basics;

import java.util.Enumeration;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
//        String s = "$10.99";
//        String r = "$10.32";
//        String a= s.replace("$","").replace(".", "");
//        String b= r.replace("$","").replace(".", "");
//        System.out.println((Integer.parseInt(a)+Integer.parseInt(b))/100.0);
//        System.out.println((Integer.valueOf(a)+Integer.valueOf(b))/100.0);
//
//        System.out.println((Double.parseDouble(a)+Double.parseDouble(b))/100.0);
//
//        //reverse string
//        String str = "I like Java";
//        for (int i =str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }
//        System.out.println();

        //checkPalindrome();

        //sumOfAllInt();
        //drawTriangle();

        //drawTriangleRevers();

        //Print numbers divisbile by 6 and 8 from 500 to 25
//        int a=500;
//        while (a>24){
//
//            if(a%6==0 && a%8==0){
//                System.out.println(a + " ");
//            }
//            a--;
//        }

        //findSum();

        //findfactors();

        //countChars();

        findWon();

    }


    //palindrome

    public static void checkPalindrome() {
        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.substring(i, i + 1);
        }
        System.out.println(reverse);
        if (str.equals(reverse)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        scanner.close();
    }

    public static void sumOfAllInt() {
        int sum = 0;
        for (int i = 10; i < 201; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void drawTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int s = scanner.nextInt();

        for (int i = 1; i <= s; i++) {
            // to draw spaces
            for (int j = s - i; j >= 0; j--) {
                System.out.print(" ");
            }
            //draw for "* "
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
    public static void drawTriangleRevers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int s = scanner.nextInt();

        for (int i = s; i >0; i--) {

            // to draw spaces
            for (int j = 0; j <s-i; j++) {
                System.out.print(" ");
            }
            //draw for "* "
            for (int k = s; k >s-i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void findSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scanner.nextInt();
        int sum=0;
        while (num!=0){
            sum +=num%10;
            num = num/10;
        }
        System.out.println(sum);
        scanner.close();
    }
    public static void findfactors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scanner.nextInt();
        if(num<0){
           num = -num;}
        int i =1;
        while (i<=num){
            if(num%i==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
    public static void countChars(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String text = scanner.nextLine();

        int index= 0;
        int digitCounter= 0;
        int letterCounter= 0;
        int otherCounter =0;

        do{
            boolean isDigit= text.charAt(index)>='0' && text.charAt(index)<= '9';

            if (isDigit) {
                digitCounter++;

            }
            boolean isLetter= text.charAt(index)>='a' && text.charAt(index)<= 'z'|| text.charAt(index)>='A' && text.charAt(index)<= 'Z';

            if (isLetter) {
                letterCounter++;
            }

            boolean isOther= !isDigit && !isLetter;
            if (isOther) {
                otherCounter++;
            }
            index++;

        }while (index<text.length());
        System.out.println("Digit number count is " + digitCounter);
        System.out.println("Digit letter count is " + letterCounter);
        System.out.println("Digit letter count is " + otherCounter);

        scanner.close();
    }
    public static void findWon(){
        Scanner scanner = new Scanner(System.in);
        int num =0;
        do {
            System.out.println("Enter an integer number to play ...");
            num = scanner.nextInt();

        }while (num>=10);

        System.out.println("Congrats you won!...");
    }
}