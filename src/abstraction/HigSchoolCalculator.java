package abstraction;

public class HigSchoolCalculator extends Operations{
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
    public double sqrt(int a){
        System.out.println("High School square root method");
        return super.sqrt(a);
    }
}
