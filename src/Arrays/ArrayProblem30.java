package Arrays;

import java.util.Scanner;

public class ArrayProblem30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scanner.nextInt();
        }

        int max = a[0];

        for (int i = 0; i < n; i += 2) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
