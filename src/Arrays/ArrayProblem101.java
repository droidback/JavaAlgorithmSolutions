package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem101{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N=");
        int n = scan.nextInt();
        System.out.print("K=");
        int k = scan.nextInt();


        int[] a = new int[n];
        System.out.println("Massiv elementlarini probel bn kiriting!!!");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int j=0;
        for (int i = 0; i < n - k; i++) {
            a[i] = a[k+j];
            j++;

        }


        for (int i = 0; i < k; i++) {
            a[n - 1 - i] = 0;
        }


        System.out.println(Arrays.toString(a));

    }
}