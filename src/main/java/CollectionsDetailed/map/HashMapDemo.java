package CollectionsDetailed.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap m = new HashMap();
        HashMap<Integer, String> m = new HashMap<>();
        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Scott");
        m.put(104, "Mary");
        m.put(105, "Tye");
        m.put(103, "X");
        m.put(105, "David");

        System.out.println(m); // {101=John, 102=David, 103=X, 104=Mary, 105=Tye}

        //retrieve a value
        System.out.println(m.get(105)); //Tye

        m.remove(104);// remove pair from hashmap
        System.out.println(m); // {101=John, 102=David, 103=X, 105=David}

        System.out.println(m.containsKey(101)); // return boolean value true
        System.out.println(m.containsValue("Tye")); //false

        System.out.println(m.keySet());// [101, 102, 103, 105]

        System.out.println(m.values()); //[John, David, X, David]

        System.out.println(m.entrySet());// [101=John, 102=David, 103=X, 105=David] all the entries as set object

        for (Object i : m.keySet()) {

            System.out.println("Key " + i + " value " + m.get(i));

        }

        //ENTRY interface if we want to read a pair

        System.out.println("Entry interface");

        for (Map.Entry entry : m.entrySet()) {
            System.out.println(entry.getKey() + " with Entry interface " + entry.getValue());
        }

        // using iterator

        //Set set = m.entrySet();
        Iterator iterator = m.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();// first pair
            System.out.println(entry.getKey() + " with Iterator " + entry.getValue());
        }


    }
}
