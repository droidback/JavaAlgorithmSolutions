package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(30) - 10;
        }
        System.out.println(Arrays.toString(a));


        for (int i = 0; i < n - 1; i++) {
            a[i] = (a[i] + a[i + 1]) / 2;
        }
        System.out.println(Arrays.toString(a));
    }
}