package MinMax;

import java.util.Scanner;

public class MinMax20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int max = 0;
        int min = 0;
        int countMin = 0;
        int countMax = 0;
        for (int i = 1; i <=n ; i++) {
            int number= scan.nextInt();

            if (number<min||i==1){
                min = number;
            }
            if (number>max||i==1){
                max = number;
            }

            if(number==min) countMin++;
            else if (number==max) countMax++;
        }
        System.out.println(countMax+countMin);

    }
}
