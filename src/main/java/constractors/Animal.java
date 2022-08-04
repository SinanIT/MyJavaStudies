package constractors;

public class Animal {
    public String name ="Joe";
    public int weight;
    public static boolean isHerbivorous;

    public static void eat(){
        if (isHerbivorous) {
            System.out.println("Eats plants");
        } else {
            System.out.println("Eats both plants and meat");
        }
    }
    public static void drink(){
        System.out.println("Drinks water");
    }
    public void move(){
        System.out.println("Moves");
    }

    //construct's names same with class name
    //constructors don't have return

    public static void main(String[] args) {
        Animal dog = new Animal();// by using const i created dog obj
        System.out.println(dog.name);

    }
}
