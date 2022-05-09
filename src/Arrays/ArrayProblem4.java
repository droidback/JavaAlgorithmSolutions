package Arrays;

import java.util.Scanner;

public class ArrayProblem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) ( a * Math.pow(d, i));
        }

        for (int i = 0; i < n; i++)
            System.out.println("array[" + i + "]=" + array[i]);
    }
}
