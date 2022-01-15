package Constractors;

public class Animal2 {
    public String name;
    public int weight;
    public boolean herbivorous;
//nonstatic variables can use in constructor

    public Animal2() {
        this("Joe", 25, true);
        System.out.println("First constructor is executed");
    }

    public Animal2(String name) {
        this();
        System.out.println("Second constructor is executed");
        this.name = name;
    }

    public Animal2(String name, int weight) {
        System.out.println("Third constructor is executed");
        this.name = name;
        this.weight = weight;
    }

    public Animal2(String name, int weight, boolean herbivorous) {
        System.out.println("Forth constructor is executed");
        this.name = name;
        this.weight = weight;
        this.herbivorous = herbivorous;
    }

    public static void main(String[] args) {
        // Animal2 animal2 = new Animal2("Cat",25);

        Animal2 animal = new Animal2("Mark");
        System.out.println(animal.name);
        System.out.println(animal.weight);
//
//        Animal2 animal3 = new Animal2("Mark", 34, false);
//        System.out.println(animal3.name);


    }
}
