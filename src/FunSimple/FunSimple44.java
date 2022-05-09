package FunSimple;

import java.util.Scanner;

public class FunSimple44 {
    public static double ArcTan1(double x, double n) {
        double sum = x, p = x;
        for (int i = 1; i <= n; i++) {
            p *= x * x;
            sum += Math.pow(-1, i) * p / (2 * i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println(ArcTan1(scan.nextDouble(), scan.nextDouble()));
        }
    }
}
