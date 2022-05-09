package TanlanganMasalalar;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();

        double min;
        if (a <= b && a <= c) min = a;
        else if (b <= a && b <= c) min = b;
        else min = c;

        System.out.println(min);

    }
}
