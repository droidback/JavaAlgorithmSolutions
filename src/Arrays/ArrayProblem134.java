package Arrays;

import java.util.Scanner;

public class ArrayProblem134 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        double d = 0;
        int index1 = 0, index2 = 0;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
            b[i] = scan.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                d = Math.sqrt(Math.pow(a[i] - a[j], 2) + Math.pow(b[i] - b[j], 2));
                if (max < d) {
                    max = d;
                    index1 = i;
                    index2 = j;

                }
            }
        }
        System.out.print(a[index1] + "\t" + b[index1]);
        System.out.println();
        System.out.print(a[index2] + "\t" + b[index2]);
        System.out.println();
        System.out.println(max);
    }
}
