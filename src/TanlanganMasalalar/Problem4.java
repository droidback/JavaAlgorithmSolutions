package TanlanganMasalalar;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                if (day == 31) day = 0;

            case 2:
                if (day == 28) day = 0;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) day = 0;
                break;
            default:
                System.out.println("bunday oy yo'q");
        }

        if (day == 0) {
            if (month == 12) {
                month = 1;
            } else month++;
        }

        if (day < 31) {
            day++;
            System.out.println(day + " " + month);

        } else if (day != 31) System.out.println("bunday sana yo'q");
    }
}

