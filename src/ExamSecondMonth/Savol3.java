package ExamSecondMonth;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 12.Dec.2021; time: 21:11
 * @company: EPAM
 */
public class Savol3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n, then your numbers with space: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            if (a[i - 1] < a[i] && a[i + 1] < a[i]) {
                if (a[i] < min) min = a[i];
            }
        }
        System.out.println(min);
    }
}
