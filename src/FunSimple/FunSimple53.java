package FunSimple;

import java.util.Scanner;

public class FunSimple53 {
    public static boolean IsLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    public static int MonthDays(int m, int y) {
        int Days = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Days = 30;
                break;
            case 2:
                if (IsLeapYear(y)) {
                    Days = 29;
                } else {
                    Days = 28;
                }
                break;

        }
        return Days;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y1;
        for (int i = 1; i <= 3; i++) {
            y1 = scan.nextInt();
            System.out.println(MonthDays(scan.nextInt(), y1));

        }
    }
}
