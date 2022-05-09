package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) - 2;
        }
        System.out.println(Arrays.toString(a));

        if (a[0] > a[1]) {
            a[0] += a[1];
            a[1] = a[0] - a[1];
            a[0] -= a[1];
        }
        int j, temp;
        for (int i = 2; i <= n - 1; ++i) {
            temp = a[i];
            for (j = i - 1; j >= 0; --j) {
                if (temp < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
