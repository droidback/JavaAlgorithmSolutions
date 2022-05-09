package TanlanganMasalalar;

import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int minIndex;
        for (int i = 0; i < n-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }

        for (int element: a) {
            System.out.print(element+" ");
        }
    }
}