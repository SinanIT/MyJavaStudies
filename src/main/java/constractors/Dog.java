package constractors;

public class Dog {

    public int height;
    public int weight;

    public String name;

    //constructor with no parameters
    public Dog(){
    }

    //constructor with parameters
    public Dog(String name){
        this.name= name;
    }
    public Dog(int weight,int height ){
        this.weight= weight;
        this.height= height;
    }
    public Dog(String name,int height, int weight){
        this.name= name;
        this.weight= weight;
        this.height= height;
    }
    public void sound(){
        System.out.println("Dogs Barks");
    }

    public static void main(String[] args) {
        // to access clas members need to create an object
        Dog dog1 = new Dog("Joe");
        System.out.println(dog1.name);
        Dog dog = new Dog("Dixy", 50, 70);
        System.out.println(dog.name);
        System.out.println(dog.height);
        System.out.println(dog.weight);

        dog1.sound();
        dog.sound();


    }
}
