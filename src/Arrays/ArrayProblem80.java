package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                a[i] = 0;
            } else {
                a[i] = a[i + 1];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}