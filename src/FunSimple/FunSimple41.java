package FunSimple;

import java.util.Scanner;

public class FunSimple41 {
    public static double sin1(double x, double n) {
        double sum = x, p = 1;
        for (int i = 1; i <= n; i++) {
            p *= 2 * i * (2 * i + 1);
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / p;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1=scan.nextDouble();
        for (int i = 1; i <=3 ; i++) {
            System.out.println(sin1(x1,scan.nextDouble()));
        }
    }
}

