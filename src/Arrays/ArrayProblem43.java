package Arrays;

import java.util.Scanner;

public class ArrayProblem43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) count++;
        }
        System.out.println(count);
    }
}
