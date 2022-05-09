package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 2;
        }
        System.out.println(Arrays.toString(a));
        int max;
        for (int i = n - 1; i > 0; i--) {
            max = 1;
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }
            if (i != max) {
                a[i] = a[i] + a[max];
                a[max] = a[i] - a[max];
                a[i] = a[i] - a[max];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
