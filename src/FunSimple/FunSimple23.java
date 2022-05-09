package FunSimple;

import java.util.Scanner;

public class FunSimple23 {
    public static int Quarter(double x, double y) {
        if ((x > 0) && (y > 0)) {
            return 1;
        }else if ((x < 0) && (y > 0)) {
            return 2;
        }else if ((x < 0) && (y < 0)) {
            return 3;
        }else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            System.out.println(Quarter(x, y));
        }
    }
}
