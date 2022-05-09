package SwitchCase;

import java.util.Scanner;

public class CaseNumber12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double p = 3.14;
        System.out.println("choose one of the parameters 1-R 2-D 3-L 4-S: ");
        int parameter = scan.nextInt();

        System.out.println("enter the value : ");
        double value = scan.nextDouble();

        switch (parameter) {
            case 1:
                System.out.println("R = " + value + " D=" + 2 * value + " L = " + 2 * p * value + " S = " + p * Math.pow(value, 2));
                break;
            case 2:
                System.out.println("R = " + value / 2 + " D=" + value + " L = " + p * value + " S = " + (p * Math.pow(value, 2)) / 4);
                break;
            case 3:
                System.out.println("R = " + value / 2 * p + " D=" + value / p + " L = " + value + " S = " + (Math.pow(value, 2)) / 4 * p);
                break;
            case 4:
                System.out.println("R = " + Math.sqrt(value / 2) + " D=" + 2 * Math.sqrt(value / 2) + " L = " + 2 * p * Math.sqrt(value / 2) + " S = " + value);
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}