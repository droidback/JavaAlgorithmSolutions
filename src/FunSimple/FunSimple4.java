package FunSimple;

import java.util.Scanner;

public class FunSimple4 {
    public static void Triangle(double a){
        double s= a*a*Math.sqrt(3)/4.0;
        double p =3*a;
        System.out.println("s: "+s);
        System.out.println("p: "+p);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("enter a: ");
            double a = scan.nextDouble();
            Triangle(a);
        }
    }
}
