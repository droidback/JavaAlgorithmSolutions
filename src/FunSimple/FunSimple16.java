package FunSimple;

import java.util.Scanner;

public class FunSimple16 {
    public static int Sign(int number) {
        return Integer.compare(number, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println(Sign(number) + " " + Sign(number2));

    }
}
