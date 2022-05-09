package MinMax;

import java.util.Scanner;
//test qilib kurish kerak
public class MinMax19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int min = 0;
        int count =1;
        for (int i = 1; i <=n ; i++) {
            int number = scan.nextInt();
            if(min==number){
                count++;
            }
            if (number<=min || i==1){
                min = number;
            }
        }
        System.out.println(count);
    }
}
