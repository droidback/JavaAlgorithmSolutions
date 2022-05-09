package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 21:19
 * @company: EPAM
 */
public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double start = scan.nextDouble();
        double p = 8;
        int k = 0;
        double doubleStart = 2 * start;

        while (start <= doubleStart) {
            start += start * p / 100.0;
            k++;
        }
        System.out.println(k + " oy " + start);
    }
}
