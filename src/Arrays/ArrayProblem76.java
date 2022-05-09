package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(51) - 10;
        }
        System.out.println(Arrays.toString(a));

        int k = a[0];
        for (int i = 1; i < n - 1; i++) {

            if (a[i] > k && a[i] > a[i + 1]) {

                k = a[i];
                a[i] = 0;
            } else {
                k = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}