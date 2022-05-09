package SwitchCase;

import java.util.Scanner;

public class CaseNumber7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the wight a: ");

        double a = scan.nextDouble();

        System.out.println("choose unit 1-kilogram 2-milligram 3-gram 4-tonne 5-centner: ");
        switch (scan.nextInt()) {
            case 1:
                System.out.print(a + " kg to kg: " + a);
                break;
            case 2:
                System.out.print(a + " mg to kg: " + a / 1000000);
                break;
            case 3:
                System.out.print(a + " gm to kg: " + a / 1000);
                break;
            case 4:
                System.out.print(a + " tn to kg: " + a * 1000);
                break;
            case 5:
                System.out.print(a + " cnt to kg: " + a * 100);
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}
