package Collections;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Cat", 3);
        hm.put("Caterpillar", 11);
        hm.put("Lion", 4);
        hm.put("Tiger", 5);
        //if you send existing values in to a map, map overrides, it means updates the value
        hm.put("Cat", 999);

        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("Cat", 3);
        hm2.put("Caterpillar", 11);
        hm2.put("Lion", 4);
        hm2.put("Tiger", 5);
        System.out.println(hm);//{Cat=999, Lion=4, Caterpillar=11, Tiger=5}
        System.out.println(hm.keySet());//[Cat, Lion, Caterpillar, Tiger]==> Result is SET. It is returning SET. Set is the best option to put Keys.
        System.out.println(hm.values());//[999, 4, 11, 5]==> returns collection. It can be put in arraylist or linked-list or PQ etc.
        System.out.println(hm.containsKey("Cat"));//true
        System.out.println(hm.containsValue(11));//true

        System.out.println(hm.entrySet());//[Cat=999, Lion=4, Caterpillar=11, Tiger=5] this is Set collection. We changed the structer.

        System.out.println(hm.equals(hm2));//false  -- this method doesn't check order of elements
        //to get a values for specific key
        System.out.println(hm.get("Cat"));//999. get method works for every data type because it is using Object data type. Returns null for nonexistent keys.

        System.out.println(hm.getOrDefault("Snake", 404));//404

        //
        hm.putAll(hm2);//{Cat=3, Lion=4, Caterpillar=11, Tiger=5}


        //compute is used to update value of specific key. It can Not update the Key.
        hm.compute("Lion", (key, value) -> value + 5);//{Cat=3, Lion=9, Caterpillar=11, Tiger=5}
        hm.compute("Tiger", (key, value) -> value = 555);//555
        hm.compute("Tiger", (key, value) -> value = key.length() + 10);//15
        //update an a key value if preseny
        hm.computeIfPresent("Caterpillar", (key, value) -> value + 9);//{Cat=3, Lion=9, Caterpillar=20, Tiger=15}. If there is no key it compile but did nothing.
        hm.computeIfAbsent("Snake", a -> 5);//{Snake=5, Cat=3, Lion=9, Caterpillar=20, Tiger=15} // executed if the key doesn't exist.
        hm.putIfAbsent("New Key", 9999);//{New Key=9999, Snake=5, Cat=3, Lion=9, Caterpillar=20, Tiger=15}
        System.out.println(hm);


    }
}
