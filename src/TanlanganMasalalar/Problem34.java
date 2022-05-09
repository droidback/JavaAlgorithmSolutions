package TanlanganMasalalar;

import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " " + arr[n - 1 - i] + " ");
        }
        if (n % 2 != 0) System.out.print(arr[n / 2]);
    }
}