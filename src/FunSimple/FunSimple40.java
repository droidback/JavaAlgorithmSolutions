package FunSimple;

import java.util.Scanner;

public class FunSimple40 {
    public static double Exp1(double x, double n) {
        double sum = 1, p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
            sum += Math.pow(x, i) / p;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        for (int i = 1; i <= 3; i++) {
            System.out.println(Exp1(x1, scan.nextDouble()));
        }
    }
}
