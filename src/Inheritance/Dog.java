package Inheritance;

public class Dog extends Mammal {
    public boolean smellWell;
    public boolean tail;
    public int birthYear;

    public Dog() {

        //super(); is invisible here, and it is going to parent constructor then Java starto work from top
        System.out.println("Dog constructor without parameter");
    }

    public Dog(boolean smellWell) {
        super(true);// it reaches constructor. super.haveBaby; reaches variables of parent class.
        this.smellWell = smellWell;
       super.haveBaby= true;
       super.weight = 11;
       super.height = 22;
    }

    public void bark() {
        System.out.println("Dogs bark ...");
    }
}
