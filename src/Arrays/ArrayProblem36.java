package Arrays;

import java.util.Scanner;

public class ArrayProblem36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < a.length - 1; i++) {
            if (!(a[i] < a[i - 1] && a[i] < a[i + 1]) && !(a[i - 1] < a[i] && a[i + 1] < a[i])) {
                if (a[i] > max) max = a[i];
            }
        }

        if (a[0] > max) max = a[0];
        else if (a[a.length - 1] > max) max = a[a.length - 1];
        System.out.println(Math.max(max, 0));
    }
}
