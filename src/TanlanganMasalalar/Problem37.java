package TanlanganMasalalar;

import java.util.Scanner;

public class Problem37{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int element=0;
        for (int j : arr) {
            if (Math.abs(j - r) < min) {
                min = Math.abs(j - r);
                element=j;
            }
        }
        System.out.println(element);
    }
}