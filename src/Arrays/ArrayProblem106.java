package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem106 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("n: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));

        int count = 0;
        for (int i = 0; i < n; i += 2) {
            count++;
        }

        int[] b = new int[n + count+1];

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        for (int i = (n / 2) * 2-1; i > 0; i -= 2) {
            n++;
            for (int j = n; j > i-2; j--) {
                b[j] = b[j - 1];
            }
        }
        System.out.println(Arrays.toString(b));

    }

}