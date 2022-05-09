package MinMax;

import java.util.Scanner;

public class MinMax1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter n: ");
        int n = scan.nextInt();
        int number = scan.nextInt();
        int min = number;
        int max = number;

        for (int i = 2; i <= n; i++) {
            number = scan.nextInt();

            if (number < min) min = number;

            if (number > max) max = number;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
