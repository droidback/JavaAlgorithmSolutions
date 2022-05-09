package MinMax;

import java.util.Scanner;

public class MinMax10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int number = scan.nextInt();
        int min = number;
        int max = number;
        int count = 1;
        int count2 = 1;

        for (int i = 2; i <= n; i++) {
            number = scan.nextInt();

            if (number < min) {
                min = number;
                count = i;
            }

            if (number > max) {
                max = number;
                count2 = i;
            }
        }
        if (count2 > count) {
            System.out.println("min- "+min);
            System.out.println(count + " -element");
        } else {
            System.out.println("max- "+max);
            System.out.println(count2 + " -element");
        }


    }
}
