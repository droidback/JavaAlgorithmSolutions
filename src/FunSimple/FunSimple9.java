package FunSimple;

import java.util.Scanner;

public class FunSimple9 {
    public static int AddLeftDigit(int number, int r) {
        int temp =10;
        while(number>temp) temp*=10;
        number +=r*temp;
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
            System.out.println(AddLeftDigit(number, r));
        }
    }
}
