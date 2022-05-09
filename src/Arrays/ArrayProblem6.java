package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = a + b;
        array[2] = sum;
        for (int i = 3; i < n; i++) {
            array[i] = 2 * sum;
            sum = array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
