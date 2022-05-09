package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem128 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[2 * n];
        int[] b = new int[n];
        int[] c = new int[n];
        int son = 1, m = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == a[i + 1]) {
                son++;
            } else {
                b[m] = son;
                if (b[m] > max) {
                    max = b[m];
                }
                c[m++] = a[i];
                son = 1;

            }
        }
        int t = 0;
        for (int i = 0; i < m; i++) {
            if (b[i] == max) {
                for (int j = 1; j <= b[i]; j++) {
                    a[t++] = c[i];
                }
                a[t++] = 0;
            } else {
                for (int j = 1; j <= b[i]; j++) {
                    a[t++] = c[i];
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
