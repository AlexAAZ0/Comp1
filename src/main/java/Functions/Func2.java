package Functions;

public class Func2 implements Function {
    @Override
    public double func(double x) {
        return 100 * x * x - 10000 * x - 3;
    }

    @Override
    public double funcFirstDeriv(double x) {
        return 200 * x - 10000;
    }

    @Override
    public double funcSecondDeriv(double x) {
        return 200;
    }
}
