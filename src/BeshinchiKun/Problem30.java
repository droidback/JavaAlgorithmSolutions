package BeshinchiKun;

import java.util.Scanner;

public class Problem30{
    static boolean isLeapYear(int n) {
        return n % 400 == 0 || n % 4 == 0 && n % 100 != 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        for (int i = 0; i < 3; i++) {
            if(isLeapYear(scan.nextInt()))count++;
        }
        System.out.println(count);
    }
}