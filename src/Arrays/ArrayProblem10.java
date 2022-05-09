package Arrays;

import java.util.Scanner;

public class ArrayProblem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("%-2d", array[i]);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                System.out.printf("%-2d", array[i]);
            }
        }



    }
}
