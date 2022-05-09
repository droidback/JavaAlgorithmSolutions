package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem97 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("N=");
        int n = scan.nextInt();

        int[] a = new int[n];
        System.out.println("Massiv elementlarini probel bn kiriting!!!");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int indeks = 0;
        int count = 0;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[i] = 0;
                    count++;
                }
            }
            if (a[i] != 0) {
                a[indeks++] = a[i];
            }
        }
        for (int i = 0; i < count; i++) {
            a[n - 1 - i] = 0;
        }


        System.out.println(Arrays.toString(a));
    }
}