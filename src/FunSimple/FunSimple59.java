package FunSimple;

import java.util.Scanner;

public class FunSimple59 {
    static double Dist(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Length(x1, y1, x2, y2);
        double result = Area(x1, y1, x2, y2, x3, y3);
        return (2 * result) / a;
    }

    static double Area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Length(x1, y1, x2, y2);
        double b = Length(x1, y1, x3, y3);
        double c = Length(x2, y2, x3, y3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double Length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double t = scan.nextDouble();
        double k = scan.nextDouble();
        double l = scan.nextDouble();
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        System.out.println(Dist(x, y, z, t, m, n));
        System.out.println(Dist(z, t, k, l, m, n));
        System.out.println(Dist(x, y, k, l, m, n));

    }
}
