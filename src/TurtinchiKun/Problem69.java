package TurtinchiKun;

import java.util.Arrays;
import java.util.Scanner;

public class Problem69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] result = sort(a);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] a) {
        int[] indices = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            indices[i] = i;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[indices[j]] > a[indices[j + 1]]) {
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }
        return indices;
    }

}