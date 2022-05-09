package SwitchCase;

import java.util.Scanner;

public class CaseNumber4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose one of them to know how many days they have 1-Jan 2-Feb 3-Mar 4-Apr 5-May 6-Jun 7-Jul 8-Aug 9-Sep 10-Oct 11-Nov 12-Dec: ");

        switch (scan.nextInt()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("this month has 28 days in a common year, otherwise 29 in leap year");
                break;
            default:
                System.out.println("invalid number!");
                break;
        }
    }
}
