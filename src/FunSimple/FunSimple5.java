package FunSimple;

import java.util.Scanner;

public class FunSimple5 {
    public static void RectPS(double x1, double y1, double x2, double y2) {
        double p = 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
        double s = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        System.out.println(p);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println(" enter x1 y1 x2 y2: ");
            double x1 = scan.nextDouble();
            double y1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            double y2 = scan.nextDouble();

            RectPS(x1, y1, x2, y2);
        }
    }
}
