package questions;

public class FindRepeatedCharacterCount {
    public static void main(String[] args) {
        String str = "aaaabbccdddee";
        System.out.println(getCharAndNum(str));

    }

    public static String getCharAndNum(String str) {
        int count = 1;
        String result = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.substring(i - 1, i).equals(str.substring(i, i + 1))) {
                count++;
                if (i == str.length() - 1) {
                    result = result + str.substring(i - 1, i) + count;
                    count = 1;
                }
            } else {
                result += str.substring(i - 1, i) + count;
                count = 1;
                if (i == str.length() - 1) {
                    result = result + str.substring(i, i + 1) + count;
                    count = 1;
                }
            }
        }
        return result;
    }
}
