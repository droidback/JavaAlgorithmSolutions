package TanlanganMasalalar;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double temp = x;

        if (x > y) {
            x = 2 * x * y;
            y = (temp + y) / 2;
        } else if (x < y) {
            x = (x + y) / 2;
            y = 2 * temp * y;
        }

        System.out.println(x + " " + y);
    }
}
