package Arrays;

import java.util.Scanner;

public class ArrayProblem62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        double[] a = new double[n], b = new double[n], c = new double[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextFloat();
        }
        int kb = 0, kc = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] > 0) {
                b[kb] = a[i];
                ++kb;
            }
            if (a[i] < 0) {
                c[kc] = a[i];
                ++kc;
            }
        }
        System.out.println("B: ");
        for (int i = 0; i < kb; ++i) {
            System.out.printf("  %d: %f\n", i + 1, b[i]);
        }
        System.out.println("C: ");
        for (int i = 0; i < kc; ++i) {
            System.out.printf("  %d: %f\n", i + 1, c[i]);
        }
    }
}