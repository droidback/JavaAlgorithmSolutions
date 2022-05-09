package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(3) +1;
        }
        System.out.println(Arrays.toString(a));
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i])
                count++;
        }
//        System.out.println(count);
        int[] b = new int[n+count];

        int k = 1;
        b[0] = 0;
        b[k] = a[1];
        for (int i = 1; i < n; ++i) {
            k++;
            if (a[i - 1] != a[i]) {
                b[k] = 0;
                ++k;
            }
            b[k] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
