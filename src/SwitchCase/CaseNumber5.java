package SwitchCase;

import java.util.Scanner;

public class CaseNumber5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers a and b: ");

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println("1-addition 2-subtraction 3-division 4-multiplication: ");

        switch (scan.nextInt()) {
            case 1:
                System.out.println("a+b= " + (a + b));
                break;
            case 2:
                System.out.println("a-b= " + (a - b));
                break;
            case 3:
                System.out.println("a/b= " + (a / b));
                break;
            case 4:
                System.out.print("a*b= " + (a * b));
                break;
            default:
                System.out.println("invalid number!");
                break;
        }
    }
}

