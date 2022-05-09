package FunSimple;

import java.util.Scanner;

public class FunSimple60 {
    static void Heights(double x, double y, double z, double t, double k, double l) {
        System.out.println(Dist(x, y, z, t, k, l));
        System.out.println(Dist1(x, y, z, t, k, l));
        System.out.println(Dist2(x, y, z, t, k, l));
    }

    static double Dist(double x, double y, double z, double t, double k, double l) {
        double result = Area(x, y, z, t, k, l);
        double a = Length(x, y, z, t);
        return (2 * result) / a;
    }

    static double Dist1(double x, double y, double z, double t, double k, double l) {
        double result = Area(x, y, z, t, k, l);
        double b = Length(x, y, k, l);
        return (2 * result) / b;
    }

    static double Dist2(double x, double y, double z, double t, double k, double l) {
        double result = Area(x, y, z, t, k, l);
        double c = Length(z, t, k, l);
        return (2 * result) / c;
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
        Heights(x, y, z, t, k, l);

    }
}
