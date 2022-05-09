package FunSimple;

import java.util.Scanner;

public class FunSimple52 {
    static boolean IsLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter the year: ");
            if(IsLeapYear(scan.nextInt())){
                count++;
            }
        }
        System.out.println(count);
    }

}
