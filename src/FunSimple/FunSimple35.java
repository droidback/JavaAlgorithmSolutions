package FunSimple;

import java.util.Scanner;

public class FunSimple35 {
    public static int DoubleFact(int number) {
        int temp = 1;
        for (; number > 0; number -= 2) temp *= number;
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = scan.nextInt();
            System.out.println(DoubleFact(number));
        }
    }
}
