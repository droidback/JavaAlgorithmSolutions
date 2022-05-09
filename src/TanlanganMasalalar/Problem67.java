package TanlanganMasalalar;

import java.util.Arrays;
import java.util.Scanner;

public class Problem67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int[] result = removeX(a, n, x);
        System.out.println(Arrays.toString(result));
    }

    static int[] removeX(int[] a, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                result[index++] = a[i];
            }
        }
        return result;
    }
}