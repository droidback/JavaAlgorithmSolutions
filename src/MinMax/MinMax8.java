package MinMax;

import java.util.Scanner;

public class MinMax8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int number = scan.nextInt();
        int min = number;
        int min2 = number;
        int count = 1;
        int count2 = 1;

        for (int i = 2; i <= n; i++) {
            number = scan.nextInt();

            if (number < min) count = i;

            if (number <= min2) count2 = i;
        }

        System.out.println(count + " -element");
        System.out.println(count2 + " -element");
    }
}
