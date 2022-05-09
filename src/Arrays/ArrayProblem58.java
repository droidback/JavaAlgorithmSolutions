package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem58{
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                b[i] += a[j];
            }
        }

        System.out.println("\n"+Arrays.toString(b));
    }
}