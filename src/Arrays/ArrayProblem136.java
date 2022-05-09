package Arrays;

import java.util.Scanner;

public class ArrayProblem136 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        double d = 0, s = 0;
        int index1 = 0, index2 = 0;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
            b[i] = scan.nextDouble();
        }
        int j = 0;
        for (int i = 0; i < n; i++, s = 0) {
            for (j = 0; j < n; j++) {
                d = Math.sqrt(Math.pow(a[i] - a[j], 2) + Math.pow(b[i] - b[j], 2));
                if (i != j) {
                    s += d;
                }
            }
            if (min > s) {
                min = s;
                index1 = i;
            }
        }
        System.out.print(a[index1] + "\t" + b[index1]);
        System.out.println();
        System.out.println(index1);

    }
}
