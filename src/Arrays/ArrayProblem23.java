package Arrays;

import java.util.Scanner;

public class ArrayProblem23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int[] a = new int[n];
        double sum1 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum1 += a[i];
        }
        double sum2 = 0;
        int count=0;
        for (int i = k - 1; i <= l - 1; i++) {
            sum2 += a[i];
            count++;
        }
        double divisionOfSums = Math.abs(sum1 - sum2);
        double meanOfDivisionSums = divisionOfSums/(n-count);
        System.out.println(meanOfDivisionSums);
    }
}
