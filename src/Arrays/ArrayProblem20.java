package Arrays;

import java.util.Scanner;

public class ArrayProblem20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = k - 1; i <= l - 1; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
