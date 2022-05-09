package ForLoop;

import java.util.Scanner;

public class ForLoopNumber4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the price of sweets: ");
        double price = scan.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "kg-" + i * price);
        }
    }
}
