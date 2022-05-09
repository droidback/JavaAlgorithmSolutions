package MinMax;

import java.util.Scanner;

public class MinMax25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int min=0;
        int temp =0;
        for (int i = 1; i <=n ; i++) {
            int number = scan.nextInt();
            if (i != 1) {
                if (i == 2) min = temp * number;
                else if (min > temp * number) {
                    min = temp * number;
                }
            }
            temp = number;
        }

        System.out.println(min);
    }
}
