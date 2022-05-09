package SwitchCase;

import java.util.Scanner;

public class CaseNumber6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number a: ");

        double a = scan.nextDouble();
        System.out.println("choose unit 1-decimeter 2-kilometer 3-meter 4-millimeter 5-centimeter: ");
        switch (scan.nextInt()) {
            case 1:
                System.out.print(a + " dm to m: " + (a / 10));
                break;
            case 2:
                System.out.print(a + " km to m: " + (a * 1000));
                break;
            case 3:
                System.out.print(a + " m to m: " + a);
                break;
            case 4:
                System.out.print(a + " mm to m: " + (a / 1000));
                break;
            case 5:
                System.out.print(a + " cm to m: " + (a / 100));
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}
