package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n that n>1: ");

        int n = scan.nextInt();
        int part = (int)Math.sqrt(n);
        int k =2;
        while(k<= part && n%k!=0){
            k++;
        }
        if ((n % k) != 0)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
