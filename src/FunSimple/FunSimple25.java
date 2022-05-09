package FunSimple;

import java.util.Scanner;

public class FunSimple25 {
    public static boolean isSquare(int k) {
        return k == Math.sqrt(k)*Math.sqrt(k);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = scan.nextInt();
            System.out.println(isSquare(number));
        }
    }
}
