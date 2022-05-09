package Arrays;

import java.util.Scanner;

public class ArrayProblem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k;
        System.out.print("N: ");
        n = scan.nextInt();
        int [] a = new int[n];

        System.out.print("K: ");
        k = scan.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "] : ");
            a[i] = scan.nextInt();
        }

        for(int i = k - 1; i < n; i += k) {
            System.out.println(a[i]);
        }
    }
}
