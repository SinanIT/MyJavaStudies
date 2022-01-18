package arraysmultidementionalarrays;

public class Encapsulation02 {
    public static void main(String[] args) {
        Encapsulation01 obj1 = new Encapsulation01();
        obj1.setSsn("454545");//original values still same in other class. We updated temporally.
        System.out.println(obj1.getSsn().equals("454545"));


    }
}
