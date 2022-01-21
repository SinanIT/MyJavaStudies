package List;

import java.util.ArrayList;
import java.util.List;

public class List05 {
    public static void main(String[] args) {
        //print a method to increase every element of the given list by 3

        List<Integer> list1 = new ArrayList<>();

        list1.add(12);
        list1.add(21);
        list1.add(32);
        list1.add(25);
        list1.add(9);
        //increaseListElement(list1);
        System.out.println(list1);
        removeOddMultiplyEvenBy5(list1);



    }
    public static void increaseListElement(List<Integer> list1){
        for(int i=0; i<list1.size(); i++){
            list1.set(i, list1.get(i)+3);
        }
    }

    public static void removeOddMultiplyEvenBy5(List<Integer> list1){
        for(int i=0; i<list1.size(); i++){
            if (list1.get(i)%2!=0){
                list1.remove(i);
                i--;
            }else{
                list1.set(i, list1.get(i)*5);
            }
        }
        System.out.println(list1);
    }
}
