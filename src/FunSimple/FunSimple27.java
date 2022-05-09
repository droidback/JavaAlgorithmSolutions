package FunSimple;

import java.util.Scanner;

public class FunSimple27 {
    public static boolean isPowerN(double number, int n){
        int i =1;
        while (i <number) i *=n;
        return i==number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(isPowerN(number,n));
        }
    }
}
