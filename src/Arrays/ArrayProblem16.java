package Arrays;

import java.util.Scanner;

public class ArrayProblem16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("n: ");
        n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(a[i]);
            System.out.println(a[n - i - 1]);
        }
        if (n % 2 != 0) {
            System.out.println(a[n / 2]);
        }
    }
}
