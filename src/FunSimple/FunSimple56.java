package FunSimple;

import java.util.Scanner;

public class FunSimple56 {
    static double Length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            int t = scan.nextInt();
            System.out.println(Length(x, y, z, t));
        }
    }
}
