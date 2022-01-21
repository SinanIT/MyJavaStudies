package inheritance2;

public class Honda extends Car {
    public void factory() {
        System.out.println("Factory is in Japan");
    }


    public void move() {
        System.out.println("Honda reaches 100 in 6 seconds");
    }


    public void engine() {
        System.out.println("Honda has eco-engine in every model");
    }


    public int spend() {
        return 22;
    }


    public String speak() { // we can make the reurn type String because String has IS A relationship with Object class. The opposite is not work.
        return "Honda can speak in Japan";

    }
    public void numOfTires() {
        System.out.println("Cars have four tires");
    }
}
