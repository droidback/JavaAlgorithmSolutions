package ForLoop;

import java.util.Scanner;

public class ForLoopNumber34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n : ");

        int n = scan.nextInt();
        double temp1 = 1;
        double temp2 =2;
        double a = 0;

        for (int i = 3; i <=n ; i++) {
            a=(temp1+2*temp2)/3.0;
            temp1 =temp2;
            temp2 =a;

            System.out.printf("%.14f ",a);
        }

    }
}
