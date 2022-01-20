package abstraction;

public class ElementarySchoolCalculator extends BlindCalculator {

    @Override
    public int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        return sum;
    }

    @Override
    public int subtract(int... a) {
        int difference = 0;
        for (int w : a) {
            difference -= w;
        }
        return difference;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public int multiplication(int... a) {
        int prod = 1;
        for (int w : a) {
            prod *= w;
        }
        return prod;
    }

    @Override
    public void read() {
        System.out.println("I am reading for you");
    }
}
