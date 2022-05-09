package SwitchCase;

import java.util.Scanner;

public class CaseNumber8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter D(day) and M(month): ");

        int day = scan.nextInt();
        int month = scan.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day >= 31) System.out.println(day + "- day " + month + "- month");
                else System.out.println("invalid input!");
                break;
            case 2:
                if (day >= 28) System.out.println(day + "- day " + month + "- month");
                else System.out.println("invalid input!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 30) System.out.println(day + "- day " + month + "- month");
                else System.out.println("invalid input!");
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}
