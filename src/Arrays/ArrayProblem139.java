package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nechta nuqta kiritasiz?:");
        int n = scan.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "-nuqtaning x=");
            x[i] = scan.nextDouble();
            System.out.print(i + 1 + "-nuqtaning y=");
            y[i] = scan.nextDouble();
        }


        for (int i = 0; i < n - 1; i++) {
            double tempx;
            double tempy;
            if (x[i] > x[i + 1] || x[i] == x[i + 1] && y[i] > y[i + 1]) {
                tempx = x[i];
                tempy = y[i];
                x[i] = x[i + 1];
                y[i] = y[i + 1];
                x[i + 1] = tempx;
                y[i + 1] = tempy;
            }
        }

        System.out.println("x");
        System.out.println(Arrays.toString(x));
        System.out.println("Y");
        System.out.println(Arrays.toString(y));

    }
}
