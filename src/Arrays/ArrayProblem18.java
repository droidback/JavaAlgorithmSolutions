package Arrays;

import java.util.Scanner;

public class ArrayProblem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] < a[n - 1]) {
                System.out.println(a[i]);
                break;
            } else if (i == (n - 1)) System.out.println(0);
        }
    }
}
