package FunSimple;

import java.util.Scanner;

public class FunSimple37 {
    public static double Power1(double a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(Power1(scan.nextDouble(), scan.nextInt()));
        }
    }
}
