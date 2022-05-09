package Arrays;

import java.util.Scanner;

public class ArrayProblem47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        boolean isOutput = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) isOutput = true;
            }
            if (!isOutput) System.out.println(a[i]);
        }
    }
}
