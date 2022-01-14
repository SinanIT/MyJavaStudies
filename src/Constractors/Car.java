package Constractors;


public class Car {

    /*
     *When you create a class Java knows you will create objects.
     * to create an abject you need constructor because of that Java put consructor behind class and called default constructors
     *
     * */

    //Features
    public String make;// instance variable
    public String model;
    public int price;
    public int year;

    //Actions
    public void move() {
        System.out.println("Moves fast");
    }

    public void stop() {
        System.out.println("Car can stop");
    }

    public static void main(String[] args) {

//        Car car1 = new Car();
//                  //Default constructor
//        System.out.println(car1.make);
//        car1.move();

        for (int x = 1; x < 6; x++) {

            int y = x < 3 ? x : ++x;
            System.out.print(y);
        }

        String name = " John Wick The Hero";
        boolean init = true;

        for (int i = 0; i < name.length(); i++) {

            if (init)
                System.out.print(name.charAt(i) + " ");
            if (name.charAt(i) == ' ') {
                init = true;
            } else {
                init = false;
            }

        }

    }
}
