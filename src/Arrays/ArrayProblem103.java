package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N=");
        int n = scan.nextInt();
        System.out.print("K=");


        int[] a = new int[n];
        System.out.println("Massiv elementlarini probel bn kiriting!!!");
        boolean birinchiElement = false;
        int maxIndeks = 0;
        int minINdeks = 0;
        int max = 0, min = 0;
        for (int i = 0; i < n; i++) {

            a[i] = scan.nextInt();
            if (!birinchiElement) {
                max = a[i];
                min = a[i];
                birinchiElement = true;
            }
            if (min > a[i]) {
                min = a[i];
                minINdeks = i;
            }
            if (max < a[i]) {
                max = a[i];
                maxIndeks = i;
            }
        }


        for (int i = maxIndeks + 1; i < n; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < minINdeks; i++) {
            a[i] = 0;
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }
        for (int i = 0; i < (n - 1 - maxIndeks + minINdeks); i++) {
            a[n - 1 - i] = 0;
        }

        System.out.println(Arrays.toString(a));
    }
}