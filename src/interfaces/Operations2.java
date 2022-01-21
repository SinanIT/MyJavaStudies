package interfaces;

public class Operations2 implements Interface03 {
    public static void main(String[] args) {
        System.out.println(Interface03.subtraction(9, 8));// static method is reachable with Interface name
        Operations2 obj = new Operations2();// create an object to reach add method in Interface03
        System.out.println(obj.add(9, 8));
        System.out.println();

        Interface03 obj2 = new Operations2();
        obj2.add(9, 8);
    }
}
