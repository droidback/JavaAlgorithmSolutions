package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("n: ");
        int n = scan.nextInt();
        int m = (n + 1) / 2;
        int[] a = new int[n + m * 2];

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        int count = 0;
        for (int i = n - 1; i > -1; i -= 2) {
            a[(n + 2 * m - 1) - count] = a[i];
            a[(n + 2 * m - 2) - count] = a[i - ((n + 1) % 2)];
            a[(n + 2 * m - 3) - count] = a[i - ((n + 1) % 2)];
            a[(n + 2 * m - 4) - count] = a[i - 1];
            count += 4;
        }
        System.out.println(Arrays.toString(a));
    }
}