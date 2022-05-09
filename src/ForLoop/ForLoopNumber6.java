package ForLoop;

import java.util.Scanner;

public class ForLoopNumber6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the price of sweets: ");
        float price = scan.nextFloat();

        for (float i = 1.2f; i <= 2.1f; i += 0.2f) {
            System.out.printf("%.1f-", i);
            System.out.printf("%.1f\n", (i * price));

        }
    }
}
