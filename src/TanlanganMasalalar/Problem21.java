package TanlanganMasalalar;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number;
        int maxSum = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();

            if (i != 0) {
                if (maxSum < temp + number) {
                    maxSum = temp + number;
                }
            }
            temp = number;

        }
        System.out.println(maxSum);
    }
}