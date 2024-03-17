package Functions;

public class Func1 implements Function {
    @Override
    public double func(double x) {
        return - Math.pow(x, 4) + 15 * Math.pow(x, 2) + 12 * x - 10;
    }

    @Override
    public double funcFirstDeriv(double x) {
        return - 4 * Math.pow(x, 3) + 30 * Math.pow(x, 1) + 12;
    }

    @Override
    public double funcSecondDeriv(double x) {
        return - 12 * Math.pow(x, 2) + 30;
    }
}
