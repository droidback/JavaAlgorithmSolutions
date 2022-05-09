package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(30) - 10;
        }
        System.out.println(Arrays.toString(a));
        int k = a[0];
        a[0] = a[n - 1];

        for (int i = n - 1; i >= 1; i--) {
            if (i == 1) a[i] = k;
            else a[i] = a[i - 1];
        }
        System.out.println(Arrays.toString(a));
    }
}