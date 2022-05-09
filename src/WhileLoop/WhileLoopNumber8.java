package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int k =1;

        while(k*k<=n){
            k++;
        }
        k--;
        System.out.println(k);
    }
}
