package TanlanganMasalalar;

import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println(min);
    }
}