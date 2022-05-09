package SwitchCase;

import java.util.Scanner;

public class CaseNumber11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the direction 's'-shimol 'j'-janub 'q'-sharq 'g'-g'arb: ");
        char direction = scan.next().charAt(0);

        System.out.println("choose one of them 0-unga buril 1-chapga buril 2-burilish 180");
        int operation = scan.nextInt();

        switch (direction) {
            case 's':
                switch (operation) {
                    case 0:
                        System.out.println("shimolda unga burildi");
                        break;
                    case 1:
                        System.out.println("shimolda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("shimolda burilish 180ga");
                        break;
                }
                break;
            case 'j':
                switch (operation) {
                    case 0:
                        System.out.println("janubda unga burildi");
                        break;
                    case 1:
                        System.out.println("janubda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("janubda burilish 180ga");
                        break;
                }
                break;
            case 'q':
                switch (operation) {
                    case 0:
                        System.out.println("sharqda unga burildi");
                        break;
                    case 1:
                        System.out.println("sharqda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("sharqda burilish 180ga");
                        break;
                }
                break;
            case 'g':
                switch (operation) {
                    case 0:
                        System.out.println("g'arbda unga burildi");
                        break;
                    case 1:
                        System.out.println("g'arbda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("g'arbda burilish 180ga");
                        break;
                }
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}
