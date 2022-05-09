package ForLoop;

import java.util.Scanner;

public class ForLoopNumber37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int pow = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                pow *= i;
            }
            System.out.println(pow);
            sum += pow;
            pow = 1;
        }
        System.out.println(sum);
    }
}
