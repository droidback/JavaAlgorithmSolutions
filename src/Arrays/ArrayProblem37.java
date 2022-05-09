package Arrays;

import java.util.Scanner;

public class ArrayProblem37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        boolean isIncreaseMonotone = false;
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                if (!isIncreaseMonotone) {
                    count++;
                    isIncreaseMonotone = true;
                } else isIncreaseMonotone = false;
            }
        }
        System.out.println(count);
    }
}
