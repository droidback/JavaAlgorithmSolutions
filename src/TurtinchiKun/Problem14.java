package TurtinchiKun;

import java.util.Scanner;


public class Problem14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0, maxindex = 0;
        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            if (number < min) {
                min = number;
                minIndex = i + 1;
            }

            if (number >= max) {
                max = number;
                maxindex = i+1;
            }
        }

        System.out.println(min + " " + minIndex + "; " + max + " " + maxindex);
    }
}
