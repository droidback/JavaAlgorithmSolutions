package Arrays;

import java.util.Scanner;

public class ArrayProblem15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("N: ");
        n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i += 2) {
            System.out.println(a[i]);
        }
        for (int i = n - n % 2 - 1; i >= 1; i -= 2) {
            System.out.println(a[i]);
        }
    }
}
