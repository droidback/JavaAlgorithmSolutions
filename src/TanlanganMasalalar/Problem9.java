package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 21:21
 * @company: EPAM
 */
public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int count = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
            count++;
        }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }
}
