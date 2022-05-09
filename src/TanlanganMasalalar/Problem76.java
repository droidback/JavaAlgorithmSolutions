package TanlanganMasalalar;

import java.util.Scanner;

public class Problem76{
    static int ekub(int a, int b) {
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return b == 0 ? a : ekub(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt(), b = scan.nextInt();
        System.out.println(ekub(a,b));
    }
}