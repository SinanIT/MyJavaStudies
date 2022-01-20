package inheritance2;

public class Honda extends Car{
    public void factory(){
        System.out.println("Factory is in Japan");
    }

    @Override
    public void move() {
        System.out.println("Honda reaches 100 in 6 seconds");
    }

    @Override
    public void engine() {
        System.out.println("Honda has eco-engine in every model");
    }

    @Override
    public int spend() {
        return 22;
    }

    @Override
    public String speak() { // we can make the reurn type String because String has IS A relationship with Object class. The opposite is not work.
        return "Honda can speak in Japan";
    }
}
