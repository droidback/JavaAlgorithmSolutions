package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
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
        int temp = b[m];
        b[m] = b[k - 1];
        b[k - 1] = temp;
        int p = c[m];
        c[m] = c[k - 1];
        c[k - 1] = p;
        int t = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 1; j <= b[i]; j++) {
                a[t++] = c[i];
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
