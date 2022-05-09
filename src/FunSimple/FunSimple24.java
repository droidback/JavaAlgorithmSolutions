package FunSimple;

import java.util.Scanner;

public class FunSimple24 {
    public static boolean Even(int k) {
        return k % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = scan.nextInt();
            System.out.println(Even(number));
        }
    }
}
