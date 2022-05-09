package ForLoop;

import java.util.Scanner;

public class ForLoopNumber38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int pow = 1;
        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            pow =i;
            for (int j = 1; j <=n-i; j++) {
                pow *= i;
            }
            System.out.println(pow);
            sum +=pow;
        }
    }
}
