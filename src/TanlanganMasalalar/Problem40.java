package TanlanganMasalalar;

import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length -1-i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}