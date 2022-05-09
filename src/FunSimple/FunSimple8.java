package FunSimple;

import java.util.Scanner;

public class FunSimple8 {
    public static int AddRightDigit(int number, int r) {
        number = number * 10 + r;
        return number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter k and (if you want stop just type 0): ");
            int number = scan.nextInt();
            if (number == 0) break;
            System.out.println("enter r that 0<r<9: ");
            int r = scan.nextInt();
            System.out.println(AddRightDigit(number, r));
        }
    }
}
