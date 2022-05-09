package Arrays;

import java.util.Scanner;

public class ArrayProblem32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextInt();
        }

        int num = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (a[i - 1] < a[i]) {
                System.out.println((i + 1) + " ");
                num++;
            }
        }
        System.out.println(num);
    }
}
