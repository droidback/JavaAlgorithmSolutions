package FunSimple;

import java.util.Scanner;

public class FunSimple3 {
    public static void MEAN(double x, double y){
        double sqrt = Math.sqrt(x * y);
        System.out.println(sqrt);
        double mean = ((x + y) / 2.0);
        System.out.println(mean);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter A: ");
        double a = scan.nextDouble();

        System.out.println("enter B: ");
        double b = scan.nextDouble();

        System.out.println("enter C: ");
        double c = scan.nextDouble();

        System.out.println("enter D: ");
        double d = scan.nextDouble();

        MEAN(a,b);
        MEAN(a,c);
        MEAN(a,d);
    }
}
