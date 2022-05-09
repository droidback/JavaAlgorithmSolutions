package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n:");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + i * 2;

        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "]=" + a[i]);
    }
}
