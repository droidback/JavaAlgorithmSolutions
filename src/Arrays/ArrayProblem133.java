package Arrays;

import java.util.Scanner;

public class ArrayProblem133 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        double d = 0, count = 0;
        int index = 0;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
            b[i] = scan.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && b[i] > 0 || a[i] < 0 && b[i] < 0) {
                d = Math.sqrt(Math.pow(a[i], 2) + Math.pow(b[i], 2));
                if (max < d) {
                    max = d;
                    index = i;
                }
            } else {
                count++;
                if (count == n) {
                    a[index] = 0;
                    b[index] = 0;
                }
            }
        }
        System.out.println(a[index]);
        System.out.println(b[index]);
    }
}
