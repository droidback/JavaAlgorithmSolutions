package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem85 {
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

        int a0;
        for (int i = 1; i <=k; i--) {
            a0 = a[n - 1];

            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = a0;
        }
        System.out.println(Arrays.toString(a));
    }
}