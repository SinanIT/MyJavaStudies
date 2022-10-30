package Collections;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(12, "Ali Can");
        tm.put(13, "Veli Han");
        tm.put(21, "Mary Star");
        tm.put(123, "Tom Hanks");
        tm.put(4, "Angie Moon");

        System.out.println(tm);//{4=Angie Moon, 12=Ali Can, 13=Veli Han, 21=Mary Star, 123=Tom Hanks}

        // if you use existing key, it will return the element whose key is same with you used
        //if you use key more than grater one it returns null
        System.out.println(tm.ceilingEntry(15));// it returns after the key 15
        System.out.println(tm.ceilingEntry(124));//null

        System.out.println(tm.descendingKeySet());//[123, 21, 13, 12, 4]
        System.out.println(tm.firstEntry());//4=Angie Moon
        System.out.println(tm.floorEntry(15));//previous element 13=Veli Han
        System.out.println(tm.floorKey(15));//previous key 13
        System.out.println(tm.headMap(13));//{4=Angie Moon, 12=Ali Can}
        System.out.println(tm.headMap(13, true));//{4=Angie Moon, 12=Ali Can, 13=Veli Han} 13 is inclusive
        System.out.println(tm.tailMap(13));//{13=Veli Han, 21=Mary Star, 123=Tom Hanks}
        System.out.println(tm.tailMap(13, false));//{21=Mary Star, 123=Tom Hanks} 13 is exclusive
    }
}
