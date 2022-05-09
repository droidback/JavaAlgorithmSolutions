package TanlanganMasalalar;

import java.util.Scanner;

public class Problem32{
    public static boolean IsLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    public static void PrevDate(int d, int m, int y) {
        System.out.printf("%02d.%02d.%04d", d, m, y);
        System.out.println();
        int k = MonthDays(m, y);
        if (d > 1 && d <= k) {
            d--;
            System.out.printf("%02d.%02d.%04d %n", d, m, y);
        } else {
            if (d == 1) {
                m--;
                if (m == 0) {
                    m = 12;
                    y--;
                }
                d = MonthDays(m, y);
                System.out.printf("%02d.%02d.%04d %n", d, m, y);
            } else {
                System.out.println("Bundey sana mavjud emas.");
            }
        }
    }


    static int MonthDays(int m, int y) {
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
        for (int i = 0; i < 3; i++) {
            PrevDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
    }
}