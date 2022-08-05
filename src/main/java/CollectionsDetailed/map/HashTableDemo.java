package CollectionsDetailed.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {

    public static void main(String[] args) {

//        Hashtable ht = new Hashtable(); // default capacity is 11. Load factors is by default 0.75. We can define initial capacity(int) and load factor(float).
//        Hashtable ht = new Hashtable(100, (float) 0.97);

        Hashtable<Integer, String> ht = new Hashtable<>(); // keys are unique bu value can be repeated. And No null key and value. no insertion order preserve.
        ht.put(101, "John");
        ht.put(102, "David");
        ht.put(103, "Smith");
        //ht.put(null, "X");// NullPointerException
        //ht.put(104, null); // NullPointerException

        System.out.println(ht.get(103)); //Smith

        ht.remove(103);

        System.out.println(ht); // {102=David, 101=John}

        System.out.println(ht.containsKey(102)); // true
        System.out.println(ht.containsValue("David")); // true
        System.out.println(ht.isEmpty()); // false

        System.out.println(ht.keySet()); //[102, 101]
        System.out.println(ht.values()); //[David, John]
        System.out.println(ht.entrySet()); // returns all entries- keys and values

        for (int k : ht.keySet()) {
            System.out.print(k + "   " + ht.get(k) + " " + "\n"); //102   David 101   John
        }

        for(Map.Entry entry : ht.entrySet()){
            System.out.println(entry.getKey() + " With Entry interface " + entry.getValue());
        }

        Iterator iterator = ht.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry =  (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " with iterator " + entry.getValue());
        }





    }
}
