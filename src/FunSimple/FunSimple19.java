package FunSimple;

import java.util.Scanner;

public class FunSimple19 {
    public static double RingS(double r1, double r2){
        final double pi = 3.1415;
        return pi*(Math.abs(r1*r1-r2*r2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            double r1 = scan.nextDouble();
            double r2 = scan.nextDouble();

            System.out.println(RingS(r1, r2));
        }
    }
}
