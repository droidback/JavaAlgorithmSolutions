package MinMax;

import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter n: ");
        int n = scan.nextInt();

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int min = number1 * number2;

        for (int i = 2; i <= n; i++) {
            number1 = scan.nextInt();
            number2 = scan.nextInt();

            if (number1*number2 < min) {
                System.out.println(number1+" "+number2);
                min = number1*number2;
            }
        }

        System.out.println(min);
    }
}
