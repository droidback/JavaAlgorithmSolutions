package FunSimple;

import java.util.Scanner;

public class FunSimple20 {
    public static double TriangleP(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            System.out.println(TriangleP(a, b));
        }
    }
}
