package Inheritance;

public class Animal {
    public int height;
    public int weight;


    public Animal() {
        this(5);
        System.out.println("Animal class without parameter...");
    }

    public Animal(int a) {
        System.out.println("Animal class with int parameter...");
    }

    public Animal(int weight, int height ) {
        this.weight = weight;
        this.height = height;
    }

    public void eat() {
        System.out.println("They eat ...");
    }

    public void drink() {
        System.out.println("They drink ...");
    }
}
