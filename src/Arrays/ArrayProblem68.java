package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(51) - 10;
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) a[i] = min;
            else if (a[i] == min) a[i] = max;
        }
        System.out.println(Arrays.toString(a));
    }
}