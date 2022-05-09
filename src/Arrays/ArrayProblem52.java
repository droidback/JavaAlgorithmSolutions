package Arrays;

import java.util.Scanner;

public class ArrayProblem52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5) b[i] = 2 * a[i];
            else b[i] = a[i] / 2;
            System.out.print(b[i]+"\t");
        }
    }
}