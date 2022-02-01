package abstraction;

public class BlindCalculator extends Operations {

    public void read() {
        System.out.println("I am reading for you");
    }

    @Override
    public int add(int... a) {
        return 0;
    }

    @Override
    public int subtract(int... a) {
        return 0;
    }

    @Override
    public int division(int a, int b) {
        return 0;
    }

    @Override
    public int multiplication(int... a) {
        return 0;
    }
}
