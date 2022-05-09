package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double[] a = new double[n];
        double[] b = new double[n];
        double[] c = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double max = (a[i] > b[i]) ? a[i] : b[i];
            c[i] = max;
        }

        System.out.println(Arrays.toString(c));
    }
}