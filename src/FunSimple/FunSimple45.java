package FunSimple;

import java.util.Scanner;

public class FunSimple45 {
    public static double Power4(double x, double a, double n) {
        double sum = 1, p = 1, k = 1;
        for (int i = 1; i <= n; i++) {
            p *= (a - i + 1);
            k *= i;
            sum += p * Math.pow(x, i) / k;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            double x = scan.nextDouble();
            double a = scan.nextDouble();
            System.out.println(Power4(x, a, scan.nextDouble()));
        }
    }
}
