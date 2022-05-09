package Arrays;

import java.util.Scanner;

public class ArrayProblem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]= scan.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <a[n-1]) max =a[i];
        }
        System.out.println(max);
    }
}
