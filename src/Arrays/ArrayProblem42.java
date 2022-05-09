package Arrays;

import java.util.Scanner;

public class ArrayProblem42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int r = scan.nextInt();
        int min = Math.abs(a[0] + a[1] - r), k = 1;

        for (int i = 2; i < n; ++i) {
            if (Math.abs(a[i - 1] + a[i] - r) < min) {
                min = Math.abs(a[i - 1] + a[i] - r);
                k = i;
            }
        }
        System.out.println(a[k - 1] + " " + a[k]);
    }
}

