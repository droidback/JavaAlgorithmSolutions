package WhileLoop;

import java.util.Scanner;

public class WhileLoopNumber9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");

        int n = scan.nextInt();
        int k =1;
        int parameter = 3;

        while(parameter<=n){
            parameter *= 3;
            k++;
        }
        System.out.println(parameter);
    }
}
