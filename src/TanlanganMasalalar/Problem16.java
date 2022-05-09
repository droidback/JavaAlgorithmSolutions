package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 24.Dec.2021; time: 16:34
 * @company: EPAM
 */
public class Problem16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            if (number <= min) {
                min = number;
                minIndex = i + 1;
            }
            if (number >= max) {
                max = number;
                maxIndex = i + 1;
            }
        }

        if (minIndex < maxIndex) {
            System.out.println(max + " " + maxIndex);
        } else {
            System.out.println(min + " " + minIndex);
        }
    }
}
