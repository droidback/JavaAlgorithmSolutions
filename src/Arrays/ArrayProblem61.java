package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(51) - 10;
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i; j < n; j++) {
                b[i] += a[j];
            }
            b[i] /= j-i;
        }
        System.out.println(Arrays.toString(b));
    }
}