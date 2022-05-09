package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[2 * n];
        int[] b = new int[n];
        int[] c = new int[n];
        int son = 1, k = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == a[i + 1]) {
                son++;
            } else {
                b[k] = son;
                c[k++] = a[i];
                son = 1;
            }
        }
        int t = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 1; j <= b[i] - 1; j++) {
                a[t++] = c[i];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
