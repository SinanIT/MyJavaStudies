package questions;

import java.util.*;

public class FindRepeatedCharacterCount {
    public static void main(String[] args) {
//        String str = "aaaabbccdddee";
//        System.out.println(getCharAndNum(str));

        String words = "This This is string but it is is not proper string string";
        findCountRepeatedWords(words);

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


    public static void findCountRepeatedWords(String str) {
        // convert string to array
        String[] strings = str.split(" ");
        Map<String, Integer> words = new LinkedHashMap<>();
        for (String element : strings){
            if(words.containsKey(element)){
                words.put(element, words.get(element) +1);
            } else{
                words.put(element,1);
            }
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }



    }

}
