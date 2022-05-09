package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(a));
        int k = scan.nextInt();
        for (int i = k; i < a.length-1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length -1] = 0;

        System.out.println(Arrays.toString(a));
    }
}