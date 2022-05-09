package FunSimple;

import java.util.Scanner;

public class FunSimple1 {
    public static double PowerA3(double number){
        return Math.pow(number,3);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter A, B, C: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.printf("%.2f %n",PowerA3(a));
        System.out.printf("%.2f %n",PowerA3(b));
        System.out.printf("%.2f %n",PowerA3(c));

        System.out.println("enter D, E: ");
        int d = scan.nextInt();
        int e = scan.nextInt();

        System.out.println((int) PowerA3(d));
        System.out.println((int)PowerA3(e));

    }
}
