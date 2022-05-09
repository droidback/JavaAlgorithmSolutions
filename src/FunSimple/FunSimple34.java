package FunSimple;

import java.util.Scanner;

public class FunSimple34 {
    public static int Fact(int number){
        if (number==0) return 1;
        else return number*Fact(number-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = scan.nextInt();
            System.out.println(Fact(number));
        }
    }
}
