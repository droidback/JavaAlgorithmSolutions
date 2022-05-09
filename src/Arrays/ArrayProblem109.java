package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem109 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("n: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) - 5;
        }
        System.out.println(Arrays.toString(a));
        int m = 0;
        for (int x : a) {
            if (x < 0) m++;
        }
        int[] b = new int[n + m];
        System.arraycopy(a, 0, b, 0, n);

        int count = 0;
        for (int i = n - 1; i > -1; i--) {
            if (b[i] < 0) {
                b[(n + m - 1) - count] = 0;
                count++;
            }
            b[(n + m - 1) - count] = b[i];
            count++;
        }

        System.out.println(Arrays.toString(b));
    }

}