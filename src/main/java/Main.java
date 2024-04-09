import LB1.Functions.Func1;
import LB1.Functions.Func2;
import LB1.Functions.Function;
import LB1.NewtonMethod;
import LB1.Tuple;
import LB2.GaussMethod;

public class Main {
    public static void main(String[] args) {
        NewtonMethod newtonMethod = new NewtonMethod();
        Function firstFunction = new Func1();
        Function secondFunction = new Func2();


        Tuple<Double, Integer> tuple = newtonMethod.FindAll(-4, -3, 0.001, firstFunction);
        System.out.println("Value: " + tuple.getX() + " Number of iterations: " + tuple.getY());

        tuple = newtonMethod.FindAll(-2, -1, 0.001, firstFunction);
        System.out.println("Value: " + tuple.getX() + " Number of iterations: " + tuple.getY());

        tuple = newtonMethod.FindAll(0, 1,0.001, firstFunction);
        System.out.println("Value: " + tuple.getX() + " Number of iterations: " + tuple.getY());

        tuple = newtonMethod.FindAll(4, 5,0.001, firstFunction);
        System.out.println("Value: " + tuple.getX() + " Number of iterations: " + tuple.getY());


        System.out.println("-----------------------2--------------------");

        double[][] A = {{5, 3, 1}, {3, 1.79999, 7}, {1, 8, 1}};
        double[] B = {12, 13.4, 18};

//        double[][] A = {{1, 2}, {4, 5}};
//        double[] B = {3, 6};

        GaussMethod gaussMethod = new GaussMethod();
        gaussMethod.MethodWithout(A, B);
        gaussMethod.Method(A, B);
    }
}
