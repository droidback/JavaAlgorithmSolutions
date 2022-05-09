package MinMax;

import java.util.Scanner;

public class MinMax24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int max=0;
        int temp =0;
        for (int i = 1; i <=n ; i++) {
            int number = scan.nextInt();

            if (i==1){
                temp =number;
            }else {
                if (max<temp+number){
                    max = temp+number;
                }
                temp = number;
            }
        }

        System.out.println(max);
    }
}
