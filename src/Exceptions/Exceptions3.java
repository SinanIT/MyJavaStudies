package Exceptions;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exceptions3 {
    public static void main(String[] args) {
        String s = "";
        //System.out.println(s.length());//0
        String s2 = null;
        //System.out.println(s2.length());//Exception in thread "main" java.lang.NullPointerException

        int arr[] = {2, 5, 6, 9};
        //System.out.println(arr[4]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        //Object i = 80;
        //String s3 = (String) i;
        //System.out.println(s3);//Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.
        // If a data

        //int a = Integer.parseInt("123");
        //System.out.println(a + 2);

        //int b = Integer.parseInt("abc");
        //System.out.println(b);//Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"

        String str = "22222";
        int len = str.length();

        // Function Call
        System.out.println(onlyDigits1(str));
    }
    public static boolean onlyDigits(String str) { //this code is not working
        // Traverse the string from
        // start to end
        for (int i = 0; i <str.length(); i++) {

            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static boolean onlyDigits1(String str)
    {
        // Regex to check string contains only digits
        String regex = "[0-9]+";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        System.out.println(p);

        // If the string is empty  return false
        if (str == null) {
            return false;
        }
        // Find match between given string and regular expression using Pattern.matcher()
        Matcher m = p.matcher(str);

        // Return if the string matched the ReGex
        System.out.println(m.matches());
        return m.matches();
    }

}

