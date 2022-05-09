package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(a));

        int k = scan.nextInt();
        int m = scan.nextInt();

        if (a.length - (k + m - 1) >= 0) System.arraycopy(a, k - 1, a, k + m - 1, a.length - (k + m - 1));
        for (int i = k; i < k + m; i++) {
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}