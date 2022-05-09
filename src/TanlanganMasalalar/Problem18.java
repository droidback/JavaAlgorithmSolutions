package TanlanganMasalalar;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number;
        int oddMax = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();

            if (number % 2 != 0 && number > oddMax) {
                oddMax = number;
                maxIndex = i + 1;
            }
        }

        if (oddMax == Integer.MIN_VALUE) System.out.println(0);
        else System.out.println(oddMax + " " + maxIndex);
    }
}