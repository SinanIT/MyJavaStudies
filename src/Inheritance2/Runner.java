package Inheritance2;

public class Runner {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.move();

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.speed);

    }
}
