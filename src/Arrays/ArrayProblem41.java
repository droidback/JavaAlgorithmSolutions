package Arrays;

import java.util.Scanner;

public class ArrayProblem41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int number1 = 0;
        int number2 = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (sum > max) {
                max = sum;
                number1 = a[i];
                number2 = a[i + 1];
            }
        }

        System.out.println(max);
        System.out.println(number1);
        System.out.println(number2);
    }
}
