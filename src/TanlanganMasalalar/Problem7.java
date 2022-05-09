package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 21:17
 * @company: EPAM
 */
public class Problem7 {
    static int sumOfDivisors(int n) {
        int s = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                s += i;
                if (i * i != n) {
                    s += n / i;
                }
            }
        }
        return s - n;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        int max = 100000;

        for (int i = 1; i <= max; i++) {
            int s = sumOfDivisors(i);
            if (i < s && s <= max && sumOfDivisors(s) == i) {
                System.out.println(i + " " + s);
            }
        }
    }
}

