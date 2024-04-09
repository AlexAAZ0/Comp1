package LB1;

import LB1.Functions.Function;

public class NewtonMethod {
    public Tuple<Double, Integer> Method(double x0, double e, Function function) {
//        while (function.func(x0) * function.funcSecondDeriv(x0) < 0) {
//            if (x0 >= 0) {x0 += 0.000001;}
//            else {x0 -= 0.000001;}
//
//        }

        double xn = x0 - function.func(x0) / function.funcFirstDeriv(x0);

        int count = 1;

        while (Math.abs(xn - x0) > e) {
            count++;

            x0 = xn;
            xn = x0 - function.func(x0) / function.funcFirstDeriv(x0);
        }

        return new Tuple<Double, Integer>(xn, count);
    }

    public Tuple<Double, Integer> FindAll(double a, double b, double e, Function function) {
        Tuple<Double, Integer> first = Method(a, e, function);
        Tuple<Double, Integer> second = Method(b, e, function);

        if (first.getY() <= second.getY()) {
            return first;
        }
        else {
            return second;
        }
    }
}
