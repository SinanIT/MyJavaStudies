package Inheritance2;

public class Vehicle {
    int speed= 20;

    public void move(){
        System.out.println("Vehicles moves");
    }
    public void engine(){
        System.out.println("Vehicle have engine");
    }
    public int spend(){
        return 11;
    }
    public Object speak(){
        return "Hello World ...";
    }
}