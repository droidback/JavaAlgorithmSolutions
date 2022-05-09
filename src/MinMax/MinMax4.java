package MinMax;

import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter n: ");
        int n = scan.nextInt();
        int number = scan.nextInt();
        int min = number;
        int count=1;

        for (int i = 2; i <= n; i++) {
            number = scan.nextInt();

            if (number < min){
                count = i;
            }
        }

        System.out.println(count+" -element");
    }
}
