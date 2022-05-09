package TanlanganMasalalar;

import java.util.Scanner;

public class Problem73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if (n == 2) return 2;
        else if (n == 1) return 1;

        return n * fact(n - 2);
    }
}