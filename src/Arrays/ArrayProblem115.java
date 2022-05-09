package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n: ");
        int n = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = random.nextInt(11) - 3;
            b[i] = i;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= n - i - 2; ++j) {
                if (a[b[j]] > a[b[j] + 1]) {

                    b[j] += b[j + 1];
                    b[j + 1] = b[j] - b[j + 1];
                    b[j] -= b[j + 1];
                }
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
