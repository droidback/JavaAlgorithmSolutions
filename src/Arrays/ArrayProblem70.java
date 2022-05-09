package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(51) - 10;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n / 2; i++) {
            a[i] += a[n / 2 + i];
            a[n / 2 + i] = a[i] - a[n / 2 + i];
            a[i] = a[i] - a[n / 2 + i];
        }
        System.out.println(Arrays.toString(a));
    }
}