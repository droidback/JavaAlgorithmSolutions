package MinMax;

import java.util.Scanner;

public class MinMax21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int max = 0;
        int min = 0;
        double sum = 0;
        int countMin = 0;
        int countMax = 0;
        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
            if (number < min) {

                if (min != max) sum += min * countMin;
                min = number;
                countMin = 0;
            }

            if (number > max) {
                if (max != min) sum += max * countMax;
                max = number;
                countMax = 0;
            }

            if (number == min) countMin++;
            else if (number == max) countMax++;
            else sum += number;

        }
//        sum = ;
        System.out.println(sum / (double) (n - countMax - countMin));
    }
}
