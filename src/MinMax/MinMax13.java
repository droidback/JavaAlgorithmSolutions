package MinMax;

import java.util.Scanner;

public class MinMax13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();

            if (number % 2 != 0 && number > max) {
                max = number;
                count = i;
            }
        }
        System.out.println(count + " -element");
    }
}
