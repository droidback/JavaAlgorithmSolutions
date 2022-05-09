package TanlanganMasalalar;

import java.util.Scanner;

public class Problem31{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.print(monthDays(year, scan.nextInt())+" ");
        }

    }

    static boolean isLeapYear(int n) {
        return n % 400 == 0 || n % 4 == 0 && n % 100 != 0;
    }

    static int monthDays(int year, int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 31;
        }
    }
}