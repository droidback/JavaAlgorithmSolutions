package Arrays;

import java.util.Scanner;

public class ArrayProblem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i]%2!=0) {
                System.out.printf("%-2d",array[i]);
                count++;
            }
        }

        System.out.printf("% d",count);
    }
}
