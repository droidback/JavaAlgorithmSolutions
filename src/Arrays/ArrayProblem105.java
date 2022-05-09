package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem105 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("n: ");
        int n = scan.nextInt(), k, m;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        System.out.print("K: ");
        k = scan.nextInt();
        System.out.print("M: ");
        m = scan.nextInt();

        n += m;
        int[] b = new int[n];
        for (int i = 0; i < n - m; i++) {
            b[i] = a[i];
        }

        for (int i = n - 1; i >= k + m - 1; --i) {
            b[i] = b[i - m];
        }
        for (int i = k; i < k + m; ++i) {
            b[i] = 0;
        }

        System.out.println(Arrays.toString(b));

    }
}