package Arrays;

import java.util.Scanner;

public class ArrayProblem131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int index = 0;
        double[] a = new double[n];
        double[] b = new double[n];
        double x = scan.nextDouble();
        double y = scan.nextDouble();


        for (int i = 0; i < n; i++) {
            a[i] = scan.nextDouble();
            b[i] = scan.nextDouble();
        }
        double d = Math.sqrt((Math.pow(a[0] - x, 2)) + Math.pow(b[0] - y, 2));
        double min = d;

        for (int i = 1; i < n; i++) {
            d = Math.sqrt((Math.pow(a[i] - x, 2)) + Math.pow(b[i] - y, 2));
            if (min > d) {
                min = d;
                index = i;

            }
        }
        System.out.println(a[index]);
        System.out.println(b[index]);
    }
}
