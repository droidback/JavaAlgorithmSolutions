package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            if (i % 2 != 0) count++;
        }

        int[] b = new int[count];
        count = 0;
        for (int i = 0; i < a.length; i += 2) {
            b[count++] = a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}