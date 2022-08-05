package HackerRankQuestions.rank;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // first solution
        SortedSet<String> sortedString = new TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            sortedString.add(s.substring(i, i + k));
        }
        smallest = sortedString.first();
        largest = sortedString.last();


        //second solution
//        for(int i = 1; i <= s.length()-k; i++ ){
//            String sub = s.substring(i, i+k);
//
//            if(sub.compareTo(smallest)< 0)
//                smallest= sub;
//
//            if(sub.compareTo(largest) > 0)
//                largest = sub;
//
//        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
