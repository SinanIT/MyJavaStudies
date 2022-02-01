package Collections;

import java.util.HashMap;

public class MapQuestion01 {
    //TODO: Create a method which return the number of every character which is used in a string
    // Hellooo==> H=1, e=1, l=2, o=3

    public static void main(String[] args) {
        System.out.println(getNumOfChars("Hellooo"));//{e=1, H=1, l=2, o=3}

    }
    public static HashMap<String, Integer> getNumOfChars(String str){
        HashMap<String, Integer>  map = new HashMap<>();
        String arr[] = str.split("");

        for (String w:arr){
            if (!map.containsKey(w)){
                map.put(w,1);
            }else{
                map.put(w,map.get(w)+1);
            }
        }
        return map;
    }
}
