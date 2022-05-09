package FunSimple;

import java.util.Scanner;

public class FunSimple32 {
    public static double DegToRad(double d) {
        return (d * 3.14 / 180.0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            double number = scan.nextDouble();
            System.out.printf("%.2f %n",DegToRad(number));
        }
    }
}
