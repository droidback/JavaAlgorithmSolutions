package Arrays;

import java.util.Scanner;

public class ArrayProblem21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        double sum = 0;
        int count =0;
        for (int i = k - 1; i <= l - 1; i++) {
            sum += a[i];
            count++;
        }
        double mean = sum/count;
        System.out.println(mean);
    }
}
