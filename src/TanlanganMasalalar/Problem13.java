package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 24.Dec.2021; time: 16:33
 * @company: EPAM
 */
public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            if (number < min){
                min = number;
                index = i+1;
            }
        }

        System.out.println(min + " " +index);
    }
}

