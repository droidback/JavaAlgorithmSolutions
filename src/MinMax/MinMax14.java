package MinMax;

import java.util.Scanner;

public class MinMax14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter b: ");
        int b = scan.nextInt();
        int count = 0;
        int min =0;

        for (int i = 1; i < 10; i++) {
            int number = scan.nextInt();

            if (number > b &&((number<min || count==0))){
                min = number;
                count = i;
            }
        }

        System.out.println(count);
    }
}