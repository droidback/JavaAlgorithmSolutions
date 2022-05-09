package FunSimple;

import java.util.Scanner;

public class FunSimple58 {
    static double Area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a1 = Perimeter(x1, y1, x2, y2, x3, y3);
        double a = Length(x1, y1, x2, y2);
        double b = Length(x1, y1, x3, y3);
        double c = Length(x2, y2, x3, y3);
        return Math.sqrt((a1 / 2) * (a1 / 2 - a) * (a1 / 2 - b) * (a1 / 2 - c));
    }

    static double Perimeter(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Length(x1, y1, x2, y2);
        double b = Length(x1, y1, x3, y3);
        double c = Length(x2, y2, x3, y3);
        return a + b + c;

    }

    static double Length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double z = scan.nextDouble();
            double t = scan.nextDouble();
            double k = scan.nextDouble();
            double l = scan.nextDouble();
            double m = scan.nextDouble();
            double n = scan.nextDouble();
            System.out.println(Area(x, y, z, t, k, l));
            System.out.println(Area(x, y, z, t, m, n));
            System.out.println(Area(x, y, k, l, m, n));
        }
    }
}
