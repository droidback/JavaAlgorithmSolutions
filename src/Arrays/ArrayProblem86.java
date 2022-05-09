package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem86{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(51) - 10;
        }
        System.out.println(Arrays.toString(a));
        int k = scan.nextInt();

        for (int i = 1; i <= k; ++i) {
            int a0 = a[0];

            System.arraycopy(a, 1, a, 0, n - 1);
            a[n-1] = a0;
        }
        System.out.println(Arrays.toString(a));
    }
}