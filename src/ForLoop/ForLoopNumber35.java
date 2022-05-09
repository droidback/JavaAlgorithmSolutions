package ForLoop;

import java.util.Scanner;

public class ForLoopNumber35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        double temp1 = 1;
        double temp2 = 2;
        double temp3 = 3;
        double temp4 = 0;
        double temp5 = 0;
        double a = 0;

        for (int i = 4; i <= n; i++) {
            a = temp3 + temp2 - 2*temp1;
            temp4 =temp3;
            temp5 = temp2;
            temp3 =a;
            temp2= temp4;
            temp1 = temp5;
            System.out.printf("%.3f ",a);
        }
    }
}
