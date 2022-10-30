package CollectionsDetailed.arraylistjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //declaration
        //1- this declaration can hold different type of object
        //ArrayList al = new ArrayList();

        //2- Single type of object
        //ArrayList<Integer> numbers = new ArrayList<>();

        //3-

        List arrayList  = new ArrayList();
        arrayList.add(5);
        arrayList.add("String");
        arrayList.add(true);
        arrayList.add(99.9);
        arrayList.add('A');

        System.out.println(arrayList); //[5, String, true, 99.9, A]
        System.out.println(arrayList.size()); // 5
        arrayList.remove(1);
        System.out.println(arrayList); // [5, true, 99.9, A]

        arrayList.add(2, "New String");
        System.out.println(arrayList); // [5, true, New String, 99.9, A]
        System.out.println(arrayList.get(2)); //New String
        arrayList.set(2, "Old string");
        System.out.println(arrayList); // [5, true, Old string, 99.9, A]
        System.out.println(arrayList.get(2)); // Old string
        System.out.println(arrayList.contains("Old string")); // true
        System.out.println(arrayList.isEmpty()); // false

        //read the data
        System.out.println("Reading elements using for loop");
        for (int i =0; i< arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " "); //5 true Old string 99.9 A
        }
        System.out.println("\nReading elements using for each loop");
        for (Object e : arrayList){
            System.out.print(e + " "); //5 true Old string 99.9 A
        }

        System.out.println("\nReading elements using iterator");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " "); // 5 true Old string 99.9 A
        }


    }
}
