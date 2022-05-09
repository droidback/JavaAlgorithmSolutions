package TanlanganMasalalar;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int currentYear = (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) ? 366 : 365;
        System.out.println(currentYear);
    }
}
