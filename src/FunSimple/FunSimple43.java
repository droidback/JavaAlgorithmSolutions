package FunSimple;

import java.util.Scanner;

public class FunSimple43 {
    public static double Ln1(double x, double n) {
        double sum = x, p = x;
        for (int i = 1; i <= n; i++) {
            p *= x;
            sum += Math.pow(-1, i) * p / (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter x that -1<x<1: ");
            System.out.println(Ln1(scan.nextDouble(), scan.nextDouble()));
        }
    }
}
