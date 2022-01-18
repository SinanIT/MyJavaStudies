package Inheritance2;

public class Audi extends Car{

    @Override
    public void move() {
        super.move();
        System.out.println("Audi moves very fast");
    }

    public void price(){
        System.out.println("Audi is expensive");
    }
}
