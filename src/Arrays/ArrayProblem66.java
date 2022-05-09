package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        int count = 0;
        boolean isEven = false;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(51) - 10;
            if (!isEven) {
                if (a[i] % 2 == 0) {
                    count = a[i];
                    isEven = true;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) a[i] += count;
        }
        System.out.println(Arrays.toString(a));
    }
}