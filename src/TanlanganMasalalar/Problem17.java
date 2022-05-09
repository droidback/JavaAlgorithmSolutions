package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 24.Dec.2021; time: 16:34
 * @company: EPAM
 */
public class Problem17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number;
        int positiveMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            if (positiveMin > number && number > 0) {
                positiveMin = number;
            }
        }
        if(positiveMin==Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(positiveMin);
    }
}
