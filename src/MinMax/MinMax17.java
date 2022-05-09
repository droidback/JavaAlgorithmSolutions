package MinMax;

import java.util.Scanner;

public class MinMax17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();

        int max = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();

            if(number > max || count==0){
                max = number;
                count=i;
            }
        }
        System.out.println(n-count);
    }
}
