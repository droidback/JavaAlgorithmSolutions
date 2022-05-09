package FunSimple;

import java.util.Scanner;

public class FunSimple2 {
    public static void PowerA234(double number) {
        for (int j = 2; j <= 4; j++) {
            double pow =Math.pow(number, j);
            System.out.printf("%.2f %n", pow);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter the number: ");
            double number = scan.nextDouble();
            PowerA234(number);
        }
    }
}
