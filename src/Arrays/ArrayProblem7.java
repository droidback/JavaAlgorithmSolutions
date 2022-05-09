package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;
        int[] array2 = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            array2[count] = array[i];
            count++;
        }

        System.out.println(Arrays.toString(array2));
    }
}
