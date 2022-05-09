package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 21:22
 * @company: EPAM
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("EKUB " + a);
    }
}
