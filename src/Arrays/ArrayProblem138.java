package Arrays;

import java.util.Scanner;

public class ArrayProblem138 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        double m, q, r, p, min = Integer.MAX_VALUE;
        int index1 = 0, index2 = 0, index3 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
            b[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    m = Math.sqrt(Math.pow(a[j] - a[i], 2) + Math.pow(b[j] - b[i], 2));
                    q = Math.sqrt(Math.pow(a[j] - a[k], 2) + Math.pow(b[j] - b[k], 2));
                    r = Math.sqrt(Math.pow(a[i] - a[k], 2) + Math.pow(b[i] - b[k], 2));
                    p = m + q + r;
                    if (min > p) {
                        min = p;
                        index1 = i;
                        index2 = j;
                        index3 = k;
                    }
                }
            }
        }
        System.out.print(a[index1] + "\t" + b[index1]);
        System.out.println();
        System.out.print(a[index2] + "\t" + b[index2]);
        System.out.println();
        System.out.print(a[index3] + "\t" + b[index3]);
    }
}
