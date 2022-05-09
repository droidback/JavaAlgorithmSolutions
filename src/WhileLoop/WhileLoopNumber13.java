package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a: ");
        int n = scan.nextInt();
        int k = 0;
        float summa = 0;

        while(summa <=n){
            k++;
            summa += 1.0 / (k*1.0);
        }
        System.out.println(k);
        System.out.println(summa);
    }
}
