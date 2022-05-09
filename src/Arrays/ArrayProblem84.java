package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(30) - 10;
        }
        System.out.println(Arrays.toString(a));

        int k = a[n - 1];
        a[n - 1] = a[0];
        for (int i = 0; i < n - 1; i++) {
            if (i == n - 2) a[i] = k;
            else a[i] = a[i + 1];
        }
        System.out.println(Arrays.toString(a));
    }
}