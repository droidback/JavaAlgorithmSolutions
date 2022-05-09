package Arrays;

import java.util.Scanner;

public class ArrayProblem40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int r = scan.nextInt();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length-1; i++) {
            if (Math.abs(a[i]-r) > Math.abs(a[i+1] -r)){
                min = a[i+1];
            }
        }
        System.out.println(min);
    }
}
