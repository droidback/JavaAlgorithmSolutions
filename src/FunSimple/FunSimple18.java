package FunSimple;

import java.util.Scanner;

public class FunSimple18 {
    public static double Circles(double radius){
        final float pi = 3.1415f;
        return pi*Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            double radius = scan.nextDouble();
            System.out.printf("%.2f %n",Circles(radius));
        }
    }
}
