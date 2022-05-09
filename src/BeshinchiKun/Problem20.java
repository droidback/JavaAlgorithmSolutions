package BeshinchiKun;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number;

        int min = Integer.MAX_VALUE;
        int minPrevious = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            number = scan.nextInt();

            if (i == 0) {
                min = number;
            }else if(i==1){
                minPrevious=number;
                if(minPrevious<min){
                    min = min+minPrevious;
                    minPrevious=min-minPrevious;
                    min=min-minPrevious;
                }
            }

            if(min>number){
                minPrevious = min;
                min = number;
            } else{
                if(minPrevious>number){
                    minPrevious=number;
                }
            }
        }

        System.out.println(min+" "+minPrevious);

    }
}