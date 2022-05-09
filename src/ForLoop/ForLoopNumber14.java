package ForLoop;

import java.util.Scanner;

public class ForLoopNumber14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            sum += i;
            System.out.println(sum);
        }
    }
}
