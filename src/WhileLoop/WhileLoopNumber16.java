package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter p that 0<p<50: ");

        int p = scan.nextInt();
        int s =10;
        int distance = 10;
        int k = 1;

        while(s<=200){
            k++;
            distance += (distance*p)/100.0;
            s +=distance;
        }
        System.out.println(k);
        System.out.println(s);
    }
}
