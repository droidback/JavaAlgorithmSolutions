package ForLoop;

import java.util.Scanner;

public class ForLoopNumber27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x (|x|<1) and n: ");

        float x = scan.nextFloat();
        int n = scan.nextInt();

        double sum = x;
        double powSurat = 1;
        double powMahraj = 1;

        for (int i = 1; i <= n; i++) {
            powSurat *= 2 * i - 1;
            powMahraj *= 2 * i;
            sum += (powSurat * Math.pow(x, (2 * i + 1))) / (powMahraj * (2 * i + 1));

        }
        System.out.println(sum);
        System.out.println(Math.asin(x));

    }
}
