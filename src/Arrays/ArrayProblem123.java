package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[2 * n];
        int[] b = new int[n];
        int[] c = new int[n];
        int son = 1, m = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == a[i + 1]) {
                son++;
            } else {
                b[m] = son;
                c[m++] = a[i];
                son = 1;
            }
        }
        if (k < m) {
            int temp = 0;
            temp = b[k];
            b[k] = b[0];
            b[0] = temp;
            int p = c[k];
            c[k] = c[0];
            c[0] = p;
        }
        int t = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= b[i]; j++) {
                a[t++] = c[i];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
