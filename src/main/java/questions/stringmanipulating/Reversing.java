package questions.stringmanipulating;

import java.util.Scanner;
import java.util.Stack;

public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //1- String
        StringBuilder sb = new StringBuilder(str);
        String newReversed = sb.reverse().toString();
        System.out.println(newReversed);

        // 2-
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println(rev);

        //3-
        System.out.println(reverse(str));


    }

    // 3-
    public static String reverse(String str) {
        // base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }

        // create an empty stack of characters
        Stack<Character> stack = new Stack<Character>();

        // push every character of the given string into the stack
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }

        // start from index 0
        int k = 0;

        // pop characters from the stack until it is empty
        while (!stack.isEmpty()) {
            // assign each popped character back to the character array
            ch[k++] = stack.pop();
        }

        // convert the character array into a string and return it
        return String.copyValueOf(ch);
    }
}
