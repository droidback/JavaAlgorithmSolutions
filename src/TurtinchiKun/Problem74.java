package TurtinchiKun;

import java.util.Scanner;

public class Problem74{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int n = scan.nextInt();
            System.out.print(fib(n)+" ");
        }
    }

    static int fib(int n){
        if(n==0) return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
}