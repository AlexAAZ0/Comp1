package LB2;

public class GaussMethod {
    public double[] MethodWithout(double[][] A, double[] B) {
        double[] X = new double[B.length];

        for (int k = 0; k < A[0].length; k++) { // прямой ход
            for (int i = k + 1; i < A.length; i++) {
                double temp = A[i][k];
                for (int j = k; j < A[0].length; j++) {
                    A[i][j] = A[i][j] - A[k][j] * temp / A[k][k];
                }
                B[i] = B[i] - B[k] * temp / A[k][k];
            }
        }

        for (int i = A[0].length - 1; i >= 0; i--) { // обратный ход
            double sum = 0;
            for (int j = i + 1; j < A[0].length; j++) {
                sum += A[i][j] * X[j];
            }

            X[i] = 1 / A[i][i] * (B[i] - sum);
        }

        Print(A,B, X);

        return X;
    }

    public double[] Method(double[][] A, double[] B) {
        double[] X = new double[B.length];

        for (int k = 0; k < A[0].length; k++) { // прямой ход

            for (int t = k + 1; t < A.length; t++) {
                if (Math.abs(A[k][0]) < Math.abs(A[t][0])) {
                    double[] temp = A[k];
                    A[k] = A[t];
                    A[t] = temp;
                }
            }

            for (int i = k + 1; i < A.length; i++) {

                double temp = A[i][k];
                for (int j = k; j < A[0].length; j++) {
                    A[i][j] = A[i][j] - A[k][j] * temp / A[k][k];
                }
                B[i] = B[i] - B[k] * temp / A[k][k];
            }
        }

        for (int i = A[0].length - 1; i >= 0; i--) { // обратный ход
            double sum = 0;
            for (int j = i + 1; j < A[0].length; j++) {
                sum += A[i][j] * X[j];
            }

            X[i] = 1 / A[i][i] * (B[i] - sum);
        }

        Print(A,B, X);

        return X;
    }


    public void Print(double[][] A, double[] B, double[] X) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + "                 ");
            }
            System.out.print("|" + B[i]);
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < X.length; i++) {
            int p = i + 1;
            System.out.println("x" + p + " = " + X[i]);
        }
        System.out.println();
    }
}
