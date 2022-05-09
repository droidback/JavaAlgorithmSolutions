package FunSimple;

import java.util.Scanner;

public class FunSimple22 {
    public static double Calc(double a, double b, int operation){
        switch (operation){
            case 1:
                return a-b;
            case 2:
                return a*b;
            case 3:
                return a/b;
            default:
                return a+b;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        for (int i = 0; i < 4; i++) {
            System.out.println("choose one operation, which are 1-subtraction 2-multiplication 3-division and others addition");
            int operation = scan.nextInt();
            System.out.println(Calc(a, b, operation));
        }
    }
}
