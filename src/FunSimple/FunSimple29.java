package FunSimple;

import java.util.Scanner;

public class FunSimple29 {
    public static int DigitCount(int number){
        int count =0;
        while(number !=0){
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.println(DigitCount(number));
        }
    }
}
