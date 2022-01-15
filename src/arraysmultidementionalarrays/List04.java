package arraysmultidementionalarrays;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        // from an integer list find the closest two elements

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);list1.add(13);list1.add(31);list1.add(12);list1.add(78);list1.add(16);list1.add(67);

        List<Integer> diffrences = new ArrayList<>();
        List<String> indexes = new ArrayList<>();

        for (int i =0 ; i<list1.size(); i ++){
            for (int k= i+1; k<list1.size(); k++){
                diffrences.add(Math.abs(list1.get(i) - list1.get(k)));
                indexes.add(i + "" + k);
            }
        }
//        System.out.println(diffrences);
//        System.out.println(indexes);
        int min = Integer.MAX_VALUE;
        for ( int i=0; i<diffrences.size(); i++){
           if(min>diffrences.get(i)){
               min=diffrences.get(i);
           }
        }
        System.out.println(min);
        int idxMin= diffrences.indexOf(min);
        String str= indexes.get(idxMin);
        System.out.println(str);

        System.out.println("First number " + list1.get(Integer.valueOf(str.substring(0,1))));
        System.out.println("Second number " + list1.get(Integer.valueOf(str.substring(1,2))));
    }
}
