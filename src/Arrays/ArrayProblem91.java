package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(a));
        int k = scan.nextInt();
        int m = scan.nextInt();
        int dif = m - k + 1;
        for (int i = k; i < a.length - dif; i++) {
            a[i] = a[i + dif];
        }

        for (int i = 0; i < dif; i++) {
            a[a.length - 1 - i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}