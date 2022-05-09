package MinMax;

import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int max = 2*(number1 + number2);

        for (int i = 2; i <= n; i++) {
            number1 = scan.nextInt();
            number2 = scan.nextInt();

            if (2*(number1 + number2) > max) {
                System.out.println(number1+" "+number2);
                max = 2*(number1 + number2);
            }
        }

        System.out.println(max);
    }
}
