import Functions.Func1;
import Functions.Func2;
import Functions.Function;

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


    }
}
