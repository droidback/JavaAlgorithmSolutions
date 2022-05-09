package MinMax;

import java.util.Scanner;

public class MinMax12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int min = -1;
        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();
            if ((number > 0 && number < min) || min<0) {
                min = number;
            }
        }
        int result = (min>0)? min:0;
        System.out.println(result);
    }
}