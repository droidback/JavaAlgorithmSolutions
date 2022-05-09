package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
    }
}