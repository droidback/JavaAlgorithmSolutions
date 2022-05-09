package Arrays;

import java.util.Scanner;
//uylab kurish kerak
public class ArrayProblem45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int k = 0, k2 = 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i] - a[j]) < Math.abs(a[k] - a[k2])) {
                    k = i;
                    k2 = j;
                }
            }
        }

        System.out.println((k + 1) + "-" + (k2 + 1));
    }
}
