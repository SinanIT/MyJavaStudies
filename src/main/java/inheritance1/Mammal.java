package inheritance1;

public class Mammal extends Animal {

    public boolean haveBaby;

    public Mammal() {
        super(2);

        //to cretae an object you can use just a single constructor
        //super() keyword must be in the first line inside the constructor
        // You can use super() just once in a constructor
        System.out.println("Mammal constructor without parameter");
    }

    public Mammal(boolean haveBaby) {
        super(3,4);
        this.haveBaby = haveBaby;
    }

    public void giveBirth() {
        System.out.println("Mammal give birth...");
    }
}
