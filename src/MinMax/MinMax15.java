package MinMax;

import java.util.Scanner;

public class MinMax15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter b and c that 0<b<c: ");

        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            int number = scan.nextInt();

            if ((number > b && number < c) && (number > max || count == 0)) {
                max = number;
                count = i;
            }
        }
        System.out.println(count+" -element");
    }
}
