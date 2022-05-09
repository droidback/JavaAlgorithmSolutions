package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 21:25
 * @company: EPAM
 */
public class Problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int i = 0;
        while (n >= m) {
            n -= m;
            i++;
        }
        System.out.println(n + " " + i);
    }
}
