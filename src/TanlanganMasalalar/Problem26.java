package TanlanganMasalalar;

import java.util.Scanner;

public class Problem26{
    static int ekub(int a, int b){
        if(a<b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        int temp;
        while(b!=0){
            temp =b;
            b=a%b;
            a=temp;
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(ekub(scan.nextInt(), scan.nextInt()));
    }
}