package questions.stringmanipulating;

import java.util.function.IntPredicate;

public class RemoveVovels {
    public static void main(String[] args) {
        String a = "idgs bfO saIku";
        countAndRemoveVowels(a);

        countAndRemoveVowels2(a);

    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static String countAndRemoveVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("Vowels count in string '" + s + "' is " + count);

        //remove vowels from
        String noVowels = "";
        for (int i = 0; i < s.length(); i++) {
            noVowels = s.replaceAll("[aeiou]", "");
        }
        System.out.println("Without vowels String '" + s + "' is like " + "'" + noVowels + "'");
        return noVowels;
    }

    //count the vowels via stream
    public static String countAndRemoveVowels2(String s) {
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int c) {
                return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
            }
        };

        long vowelsCount = s.chars().filter(vowel).count();

                System.out.println("Vowels count in string '" + s + "' is " + vowelsCount);

        //remove vowels from
        String noVowels = "";
        for (int i = 0; i < s.length(); i++) {
            noVowels = s.replaceAll("[aeiou\" \"]", "");
        }
        System.out.println("Without vowels String '" + s + "' is like " + "'" + noVowels + "'");
        return  noVowels;
    }
}
