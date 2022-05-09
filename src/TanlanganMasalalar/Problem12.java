package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 21:47
 * @company: EPAM
 */
public class Problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            if (number < min) min = number;
            if (number > max) max = number;
        }

        System.out.println(min+" "+ max);
    }
}
