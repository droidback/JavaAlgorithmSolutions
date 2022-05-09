package Arrays;

import java.util.Scanner;

public class ArrayProblem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                if (a[i] > max) max = a[i];
            }
        }
        System.out.println(max);
    }
}
