package TurtinchiKun;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number;
        int oddMax = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();

            if (number >= oddMax) {
                oddMax = number;
                maxIndex = i + 1;
            }
        }

        System.out.println(oddMax + " " + (n - maxIndex));
    }

}