package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem111 {
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
        int m = 0;
        for (int x : a) {
            if (x % 2 == 1) m+=2;
        }
        int[] b = new int[n + m];
        System.arraycopy(a, 0, b, 0, n);

        int count = 0;
        for (int i = n - 1; i > -1; i--) {
            if (b[i] % 2 == 1) {
                b[(n + m - 1) - count] = a[i];
                count++;
                b[(n + m - 1) - count] = a[i];
                count++;
            }
            b[(n + m - 1) - count] = b[i];
            count++;
        }

        System.out.println(Arrays.toString(b));
    }
}