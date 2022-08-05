package HackerRankQuestions.rank;

public class RepeatedString {
    public static void main(String[] args) {

        String a = "aba";
        long acount = repeatedString(a, 10);
        System.out.println(acount);
    }

    public static long repeatedString(String s, long n) {
        int strLength = s.length();
        long q = 0, r = 0;
        q = n / strLength;
        r = n % strLength;
        long partialStringLength = (r == 0) ? 0 : r;
        long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStringLength);
        return aCount;
    }

    public static long getLetterCount(String s, long sLength) {
        long count = 0;
        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        return count;
    }


}
