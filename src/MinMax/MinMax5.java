package MinMax;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        System.out.println("mass and volume: ");
        double mass = scan.nextDouble();
        double volume = scan.nextDouble();

        double max = mass / volume;

        for (int i = 2; i <= n; i++) {
            mass = scan.nextDouble();
            volume = scan.nextDouble();

            if (mass / volume > max) {
                System.out.println(mass + " " + volume);
                max = mass / volume;
            }
        }

        System.out.println(max);
    }
}
