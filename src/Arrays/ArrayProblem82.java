package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(30)-10;
        }

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < n; i++) {
            if (i + k < n) {
                a[i] = a[i + k];
            } else {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}