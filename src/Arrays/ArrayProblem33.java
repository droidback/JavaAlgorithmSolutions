package Arrays;

import java.util.Scanner;

public class ArrayProblem33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n;
        n = scan.nextInt();
        int[] a = new int[n];


        int i;
        for (i = 0; i < n; ++i) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextInt();
        }


        if (a[n - 1] > a[n - 2]) {
            System.out.println(n + " ");
        } else {
            i = n - 2;
            while (i >= 1 && !(a[i - 1] < a[i] && a[i] > a[i + 1])) {
                i--;
            }
            System.out.println((i + 1) + " ");
        }
    }
}
