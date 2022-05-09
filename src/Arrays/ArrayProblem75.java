package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(51) - 10;
        }
        System.out.println(Arrays.toString(a));

        int maxi = 0, mini = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxi]) maxi = i;
            else if (a[i] < a[mini]) mini = i;
        }
        if (mini > maxi) {
            mini = mini + maxi;
            maxi = mini - maxi;
            mini = mini - maxi;
        }

        for (int i = mini; i <= mini + (maxi - mini) / 2; i++) {
            if (i != mini + maxi - i) {
                a[i] = a[i] + a[mini + maxi - i];
                a[mini + maxi - i] = a[i] - a[mini + maxi - i];
                a[i] = a[i] - a[mini + maxi - i];
            }
        }

        System.out.println(Arrays.toString(a));
    }
}