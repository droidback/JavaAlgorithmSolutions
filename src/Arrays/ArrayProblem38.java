package Arrays;

import java.util.Scanner;

public class ArrayProblem38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        boolean isDecreaseMonotone = false;
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i]) {
                if (!isDecreaseMonotone) {
                    count++;
                    isDecreaseMonotone = true;
                } else isDecreaseMonotone = false;
            }
        }
        System.out.println(count);
    }
}
