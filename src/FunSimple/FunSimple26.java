package FunSimple;

import java.util.Scanner;

public class FunSimple26 {
    public static boolean isPower5(int number){
        double i =1;
        while (i <number) i *=5;
        return i==number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.println(isPower5(number));
        }
    }
}
