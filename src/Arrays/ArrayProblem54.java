package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double[] a = new double[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextDouble();
        }
        int count = 0;
        for (double v : a) {
            if (v % 2 == 0) {
                count++;
            }
        }
        double[] b = new double[count];
        count = 0;
        for (double v : a) {
            if (v % 2 == 0) {
                b[count] = v;
                count++;
            }
        }
        System.out.print("size: "+b.length+"\n"+Arrays.toString(b));
    }
}