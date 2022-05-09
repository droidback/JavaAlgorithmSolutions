package SwitchCase;

import java.util.Scanner;

public class CaseNumber10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the direction 's'-shimol 'j'-janub 'q'-sharq 'g'-g'arb: ");
        char direction = scan.next().charAt(0);

        System.out.println("choose one of them 0-harakatni davom ettir 1-chapga burul 2-unga burul");
        int operation = scan.nextInt();

        switch (direction) {
            case 's':
                switch (operation) {
                    case 0:
                        System.out.println("shimolda harakatni davom ettirdi");
                        break;
                    case 1:
                        System.out.println("shimolda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("shimolda unga buruldi");
                        break;
                }
                break;
            case 'j':
                switch (operation) {
                    case 0:
                        System.out.println("janubda harakatni davom ettirdi");
                        break;
                    case 1:
                        System.out.println("janubda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("janubda unga buruldi");
                        break;
                }
                break;
            case 'q':
                switch (operation) {
                    case 0:
                        System.out.println("sharqda harakatni davom ettirdi");
                        break;
                    case 1:
                        System.out.println("sharqda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("sharqda unga buruldi");
                        break;
                }
                break;
            case 'g':
                switch (operation) {
                    case 0:
                        System.out.println("g'arbda harakatni davom ettirdi");
                        break;
                    case 1:
                        System.out.println("g'arbda chapga buruldi");
                        break;
                    case 2:
                        System.out.println("g'arbda unga buruldi");
                        break;
                }
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}
