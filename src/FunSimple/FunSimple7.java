package FunSimple;

import java.util.Scanner;

public class FunSimple7 {
    public static int InvertDigit(int number){
        int temp = number;
        number =0;
        while (temp != 0) {
            number= number * 10 + temp%10;
            temp /= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("enter number: ");
            int number = scan.nextInt();
            System.out.println(InvertDigit(number));
        }
    }
}
