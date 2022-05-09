package MinMax;

import java.util.Scanner;

public class MinMax22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n, min1, min2, number;
        min1 = 0;
        min2 = 0;

        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            number = scan.nextInt();

            if (i == 1) {
                min1 = number;
                min2 = number;
            }

            if ((number < min2) && (number != min1)) {
                if (number < min1) {
                    min2 = min1;
                    min1 = number;
                } else min2 = number;
            }

            if (min1 == min2) min2 = number;
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}
