package Arrays;

import java.util.Scanner;

public class ArrayProblem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = a + i * d;
        }

        for (int i = 0; i < n; i++)
            System.out.println("array[" + i + "]=" + array[i]);
    }
}
