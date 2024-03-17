import Functions.Function;

import java.util.ArrayList;
import java.util.List;

public class NewtonMethod {
    public Tuple<Double, Integer> Method(double x0, double e, Function function) {
        double xn = x0 - function.func(x0) / function.funcFirstDeriv(x0);

        int count = 1;

        while (Math.abs(xn - x0) > e) {
            count++;

            x0 = xn;
            xn = x0 - function.func(x0) / function.funcFirstDeriv(x0);
        }

        return new Tuple<Double, Integer>(xn, count);
    }
}
