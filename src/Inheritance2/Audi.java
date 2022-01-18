package Inheritance2;

public class Audi extends Car{

    @Override
    public void move() {
        super.move();
        System.out.println("Audi moves very fast");
    }

    final void price(){
        System.out.println("Audi is expensive");
    }

    final void price(int a){
        System.out.println("Audi is expensive");
    }


    final static private void lux(){}

    final static private void lux(String a){}
    final static private void lux(String a, int b){}

}
