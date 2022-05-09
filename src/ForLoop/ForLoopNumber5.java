package ForLoop;

import java.util.Scanner;

public class ForLoopNumber5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the price of sweets: ");
        double price = scan.nextDouble();

        for (int i = 1; i <= 9; i++) {
            System.out.println(i / 10.0 + "kg-" + i * price / 10.0);
        }
    }
}
