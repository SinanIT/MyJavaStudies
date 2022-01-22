package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapQuestion02 {

    //TODO: Cretae a method return non-repeated elements from a list
    // Hello ==>[H, e]
    public static void main(String[] args) {
        System.out.println(getNonRepeatedChars("Hellooo"));

    }
    public static List<Map.Entry<String, Integer>> getNonRepeatedChars(String str){

        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        //creating HashMap because i will count the character one by one
        HashMap<String, Integer> map = new HashMap<>();
        String arr[] = str.split("");
        for (String w: arr){
            map.computeIfPresent(w, (key, value)-> value+1);
            map.computeIfAbsent(w, v->1);
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> w : map.entrySet()){//entrySet return a set [e=1, H=1, l=2, o=3]
            if (w.getValue()==1){
                list.add(w);
            }
        }
        return list;
    }
}
