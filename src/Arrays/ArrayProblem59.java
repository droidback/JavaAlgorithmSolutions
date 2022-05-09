package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(51) - 10;
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                b[i] += a[j];
            }
            b[i] = b[i] / (i+1);

        }
        System.out.println(Arrays.toString(b));
    }

}