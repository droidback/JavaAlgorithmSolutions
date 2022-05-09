package MinMax;

import java.util.Scanner;

public class MinMax26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int count = 0;
        int maxCount = 0;

        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();
            if (number % 2 == 0) count++;
            else {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
        }

        if (count > maxCount) maxCount = count;
        System.out.println(maxCount);
    }
}
