package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(51) - 10;
        }

        System.out.println(Arrays.toString(a));

        System.out.println("enter k: ");
        int k = scan.nextInt();
        System.out.println("enter h: ");
        int h = scan.nextInt();

        for (int i = k + 1; i <= k + (h - k) / 2; i++) {
            if (i != (h - i + k)) {
                a[i] += a[h - i + k];
                a[h - i + k] = a[i] - a[h - i + k];
                a[i] = a[i] - a[h - i + k];
            }
        }

        System.out.println(Arrays.toString(a));
    }
}