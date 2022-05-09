package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(51) - 10;
            System.out.print(a[i] + "\t");
        }
        for (int i = 1; i < n; i += 2) {
            b[count++] = a[i];
        }
        for (int i = 0; i < n; i += 2) {
            b[count++] = a[i];
        }

        System.out.println("\n" + Arrays.toString(b));
    }
}